package com.premium.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premium.model.LoanType;
@Repository
public interface ILoanTypeRepository extends CrudRepository<LoanType, Integer>{

}
