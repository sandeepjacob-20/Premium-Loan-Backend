package com.premium.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.common.APIResponse;
import com.premium.model.Users;
import com.premium.repository.IUserRepository;
import com.premium.util.JwtUtil;

@Service
public class UserService implements IUserService {
		
	@Autowired
	private JwtUtil jwtutil;

	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private APIResponse apiResponse;
	
	
	@Override
	public APIResponse loginByIdAndPassword(int loginId, String password) {
		//verify user exist or not
		Users user = userRepository.loginByLoginIdAndPassword(loginId, password);
		
		if(user==null) {
			apiResponse.setData("INVALID CREDENTIALS");
			return apiResponse;
		}
		
		//credentials are correct then
		String token = jwtutil.generateJwt(user);
		
		//storing more details and tokens
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("ACCESS TOKEN", token);
		data.put("role", user.getRoleId());
		data.put("LoginId",user.getLoginId());
		
		apiResponse.setStatus(200);
		apiResponse.setData(data);
		
		return apiResponse;
		
	}
	

	//save users
	@Override
	public Users saveUser(Users user) {
		return userRepository.save(user);
	}

}
