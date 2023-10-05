package com.premium.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VerificationStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer verificationId;
	
	private String status;

	public VerificationStatus() {
	}

	public Integer getVerificationId() {
		return verificationId;
	}

	public void setVerificationId(Integer verificationId) {
		this.verificationId = verificationId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
