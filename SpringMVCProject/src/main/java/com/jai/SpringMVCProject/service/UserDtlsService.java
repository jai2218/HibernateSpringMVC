package com.jai.SpringMVCProject.service;

import java.util.List;

import com.jai.SpringMVCProject.model.UserDetails;

public interface UserDtlsService {
	
	public List<UserDetails > getUserDetails();
	
	public void saveUserDtls(UserDetails userDtls);
	
	public UserDetails getUserDtls(int user_id);
	
	public void deleteUserDtls(int user_id);
	
	public void updateUserDtls(UserDetails userDtls);

}
