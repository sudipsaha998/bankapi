package com.banks.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banks.app.DTO.BankBranches;
import com.banks.app.error.BankDetailsException;
import com.banks.app.service.BankDetailsService;

@RestController
@RequestMapping(value="/fetch")
public class BankController {
	
	private BankDetailsService bankDetailsService;
	
	@Autowired
	public void setBankDetailsService(BankDetailsService bankDetailsService) {
		this.bankDetailsService = bankDetailsService;
	}


	@GetMapping(value="/branches")
	public List<BankBranches> getBranchDetails(@RequestParam("name") String name, @RequestParam("city") String city,
			@RequestParam("offset") String offset, @RequestParam("limit") String limit){
		String exceptionParameterName;
		long resultLimit = 0;
		long startingRow = 0;
		if(limit == "" || limit == null || Long.parseLong(limit) < 0) {
			exceptionParameterName = "limit";
			throw new BankDetailsException(exceptionParameterName);
		}
		if(offset == "" || offset == null || Long.parseLong(offset) < 0) {
			exceptionParameterName = "offset";
			throw new BankDetailsException(exceptionParameterName);
		}
		resultLimit = Long.parseLong(limit);
		startingRow = Long.parseLong(offset);
		return bankDetailsService.getBranchDetails(name, city, startingRow, resultLimit);
	}
	
	@GetMapping(value="/bank")
	public BankBranches getBankDetails(@RequestParam("ifsc") String ifsc,
			@RequestParam("offset") String offset, @RequestParam("limit") String limit){
		String exceptionParameterName;
		long resultLimit = 0;
		long startingRow = 0;
		if(limit == null || limit.strip() == "" || Long.parseLong(limit) < 0) {
			exceptionParameterName = "limit";
			throw new BankDetailsException(exceptionParameterName);
		}
		if(offset == null || offset.strip() == "" || Long.parseLong(offset) < 0) {
			exceptionParameterName = "offset";
			throw new BankDetailsException(exceptionParameterName);
		}
		resultLimit = Long.parseLong(limit);
		startingRow = Long.parseLong(offset);
		return bankDetailsService.getBankDetails(ifsc, startingRow, resultLimit);
	}
}
