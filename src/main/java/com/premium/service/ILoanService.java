package com.premium.service;

import java.util.List;

import com.premium.model.Loan;

public interface ILoanService {
	//To list all loans
	public List<Loan> getAllLoans();
	
	//to add new loan request
	public Loan addLoan(Loan loan);
	
	//to edit loans
	public Loan editLoan(Loan loan);
	
	//to delete loans
	public void deactivateLoan(int loanId);
	
	//to list loans based on verification status
	public List<Loan> getVerifiacationPendingLoans();
	
	//to list loans based on loan officer
	public List<Loan> getLoansForOfficer(int officerId);
	
	//to list loans of a specific customer
	public List<Loan> getLoansForCustomer(int customerId);
	
}
