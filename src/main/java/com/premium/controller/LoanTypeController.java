package com.premium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premium.model.LoanType;
import com.premium.service.LoanTypeService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanTypeController {
	@Autowired
	private LoanTypeService loanTypeService;
	
	@GetMapping("/getloantypes")
	public List<LoanType> getLoanTypes(){
		return loanTypeService.getAllLoanTypes();
	}
}
