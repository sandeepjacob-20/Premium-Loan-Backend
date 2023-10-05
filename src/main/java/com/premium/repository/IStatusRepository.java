package com.premium.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premium.model.Status;

@Repository
public interface IStatusRepository extends CrudRepository<Status, Integer>{
	
}
