package com.banks.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banks.app.repository.BankDetailsRepository;
import com.banks.app.DTO.BankBranches;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {

	private BankDetailsRepository bankDetailsRepository;

	@Autowired
	public void setBankDetailsRepository(BankDetailsRepository bankDetailsRepository) {
		this.bankDetailsRepository = bankDetailsRepository;
	}

	@Override
	public List<BankBranches> getBranchDetails(String name, String city, long offset, long limit) {
		// TODO Auto-generated method stub
		return bankDetailsRepository.findByNameAndCity(name.toUpperCase(), city.toUpperCase(), offset, limit);
	}

	@Override
	public BankBranches getBankDetails(String ifsc, long offset, long limit) {
		// TODO Auto-generated method stub
		return bankDetailsRepository.findByIfsc(ifsc.toUpperCase(), offset, limit);
	}
	
	
}
