package com.premium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.model.VerificationStatus;
import com.premium.repository.IVerificationStatusRepository;

@Service
public class VerificationStatusService implements IVerificationStatusService {

	@Autowired
	private IVerificationStatusRepository verificationStatusRepo;
	@Override
	public List<com.premium.model.VerificationStatus> getAllVerificationStatus() {
		// TODO Auto-generated method stub
		return (List<VerificationStatus>) verificationStatusRepo.findAll();
	}

}
