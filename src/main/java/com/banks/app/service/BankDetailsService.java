package com.banks.app.service;

import java.util.List;

import com.banks.app.DTO.BankBranches;


public interface BankDetailsService {

	public List<BankBranches> getBranchDetails(String name, String city, long offset, long limit);
	
	public BankBranches getBankDetails(String ifsc, long offset, long limit);

	
	
}
