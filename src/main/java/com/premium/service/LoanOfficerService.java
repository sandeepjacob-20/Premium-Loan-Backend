package com.premium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.model.LoanOfficer;
import com.premium.repository.ILoanOfficerRepository;

@Service
public class LoanOfficerService implements ILoanOfficerService {
	@Autowired
	private ILoanOfficerRepository loanOfficerRepo;
	
	@Override
	public List<LoanOfficer> getAllLoanOfficers() {
		// TODO Auto-generated method stub
		return (List<LoanOfficer>) loanOfficerRepo.findAll();
	}

}
