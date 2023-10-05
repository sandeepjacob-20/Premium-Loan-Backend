package com.premium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premium.common.APIResponse;
import com.premium.model.Loan;
import com.premium.service.LoanService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanController {
	
	@Autowired
	private APIResponse apiResponse;
	
	@Autowired
	private LoanService loanService;
	
	//to list all loans
	@GetMapping("/listloans")
	public List<Loan> getAllLoans(){
		return loanService.getAllLoans();
	}
	
	//to add loans
	@PostMapping("/addloan")
	public ResponseEntity<APIResponse> addLoan(@RequestBody Loan loan){
		if(loanService.addLoan(loan)==null) {
			apiResponse.setData("Error adding asset");
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid Data Entry");
			
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Loan Entered successfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
	
	//to update loans
	@PutMapping("/editloan")
	public ResponseEntity<APIResponse> editLoan(@RequestBody Loan loan){
		if(loanService.addLoan(loan)==null) {
			apiResponse.setData("Error adding asset");
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid Data Entry");
			
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Loan edited successfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
	
	//to deactivate loans
	@GetMapping("/deactivateloan/{loanId}")
	public void deactivateLoan(@PathVariable int loanId) {
		loanService.deactivateLoan(loanId);
	}
	
	//to list by verification
	@GetMapping("/listpending")
	public List<Loan> getVerifiacationPendingLoans(){
		return loanService.getVerifiacationPendingLoans();
	}
	
	//to list by verification
	@GetMapping("/listofficer/{officerId}")
	public List<Loan> getLoansForOfficer(@PathVariable int officerId){
		return loanService.getLoansForOfficer(officerId);
	}
	
	//to list loans of a customer
	@GetMapping("/listcustomer/{customerId}")
	public List<Loan> getLoansForCustomer(@PathVariable int customerId){
		return loanService.getLoansForCustomer(customerId);
	}
}
