package com.premium.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premium.model.Users;
@Repository
public interface IUserRepository extends CrudRepository<Users, Integer> {

	// custom method
	@Query("from Users WHERE loginId=?1 AND password=?2")
	public Users loginByLoginIdAndPassword(int loginId, String password);
}
