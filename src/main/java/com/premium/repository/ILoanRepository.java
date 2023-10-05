package com.premium.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premium.model.Loan;

@Repository
public interface ILoanRepository extends CrudRepository<Loan, Integer> {
	
	@Modifying
	@Query("UPDATE com.premium.model.Loan SET isActive=0 WHERE loanId=?1")
	public void deactivateLoan(int loanId);
	
	@Query("from Loan WHERE verificationId=1")
	public List<Loan> getVerifiacationPendingLoans();
	
	@Query("from Loan WHERE officerId like ?1")
	public List<Loan> getLoansForOfficer(int officerId);
	
	@Query("from Loan WHERE customerId like ?1")
	public List<Loan> getLoansForCustomer(int customerId);

}
