package com.premium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.premium.model.Loan;
import com.premium.repository.ILoanRepository;

@Service
public class LoanService implements ILoanService {
	
	@Autowired
	private ILoanRepository loanRepo;
	
	@Override
	public List<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return (List<Loan>) loanRepo.findAll();
	}

	@Override
	public Loan addLoan(Loan loan) {
		// TODO Auto-generated method stub
		return loanRepo.save(loan);
	}

	@Override
	public Loan editLoan(Loan loan) {
		// TODO Auto-generated method stub
		return loanRepo.save(loan);
	}
	
	@Transactional
	@Override
	public void deactivateLoan(int loanId) {
		// TODO Auto-generated method stub
		loanRepo.deactivateLoan(loanId);
	}

	@Override
	public List<Loan> getVerifiacationPendingLoans() {
		// TODO Auto-generated method stub
		return loanRepo.getVerifiacationPendingLoans();
	}

	@Override
	public List<Loan> getLoansForOfficer(int officerId) {
		// TODO Auto-generated method stub
		return loanRepo.getLoansForOfficer(officerId);
	}

	@Override
	public List<Loan> getLoansForCustomer(int customerId) {
		// TODO Auto-generated method stub
		return loanRepo.getLoansForCustomer(customerId);
	}

}
