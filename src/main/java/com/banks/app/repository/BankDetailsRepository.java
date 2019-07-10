package com.banks.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banks.app.DTO.BankBranches;
import com.banks.app.DTO.Branches;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankBranches, String> {
	
	@Query(value="select * from bank_branches where bank_name= ?1 and city= ?2 offset ?3 limit ?4", nativeQuery = true)
	public List<BankBranches> findByNameAndCity( String name,  String city, long offset, long limit);
	
	@Query(value="select * from bank_branches where ifsc= ?1 offset ?2 limit ?3", nativeQuery = true)
	public BankBranches findByIfsc( String ifsc, long offset, long limit);
}
