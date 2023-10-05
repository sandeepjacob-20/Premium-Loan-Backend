package com.premium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premium.model.LoanOfficer;
import com.premium.service.LoanOfficerService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanOfficerController {
	@Autowired
	private LoanOfficerService loanOfficerService;
	
	@GetMapping("/getloanofficers")
	public List<LoanOfficer> getLoanOfficers(){
		return loanOfficerService.getAllLoanOfficers();
	}

}
