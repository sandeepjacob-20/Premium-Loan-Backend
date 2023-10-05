package com.premium.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanOfficer {
	@Id
	private Integer officerId;
	
	private String name;

	public LoanOfficer() {
	}

	public Integer getOfficerId() {
		return officerId;
	}

	public void setOfficerId(Integer officerId) {
		this.officerId = officerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
