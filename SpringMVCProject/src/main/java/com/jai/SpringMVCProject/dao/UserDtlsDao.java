package com.jai.SpringMVCProject.dao;

import java.util.List;

import com.jai.SpringMVCProject.model.UserDetails;

public interface UserDtlsDao {
	
	public List <UserDetails> getUserDtls();
	
	public void saveUserDtls(UserDetails userDtls);
	
	public UserDetails getUserDtls(int user_id);
	
	public void deleteUserDtls(int user_id);
	
	public void updateUserDtls(UserDetails userDtls);
	
	

}
