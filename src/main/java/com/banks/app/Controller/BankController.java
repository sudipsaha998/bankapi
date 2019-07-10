package com.banks.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banks.app.DTO.BankBranches;
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
			@RequestParam("offset") long offset, @RequestParam("limit") long limit){
		System.out.println("jana ojana "+name+city);
		return bankDetailsService.getBranchDetails(name, city, offset, limit);
	}
	
	@GetMapping(value="/bank")
	public BankBranches getBankDetails(@RequestParam("ifsc") String ifsc,
			@RequestParam("offset") long offset, @RequestParam("limit") long limit){
		return bankDetailsService.getBankDetails(ifsc, offset, limit);
	}
}
