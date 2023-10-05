package com.premium.service;

import com.premium.common.APIResponse;
import com.premium.model.Users;

public interface IUserService {
	//add user
	public Users saveUser(Users user);
	
	//verify login
	public APIResponse loginByIdAndPassword(int loginId, String password);
	
}
