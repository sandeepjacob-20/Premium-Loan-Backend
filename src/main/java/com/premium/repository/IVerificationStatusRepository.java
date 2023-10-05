package com.premium.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premium.model.VerificationStatus;

@Repository
public interface IVerificationStatusRepository extends CrudRepository<VerificationStatus, Integer> {
	
}
