package com.premium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.model.LoanType;
import com.premium.repository.ILoanTypeRepository;

@Service
public class LoanTypeService implements ILoanTypeService {
	
	@Autowired
	private ILoanTypeRepository loanTypeRepo;
	@Override
	public List<LoanType> getAllLoanTypes() {
		// TODO Auto-generated method stub
		return (List<LoanType>) loanTypeRepo.findAll();
	}

}
