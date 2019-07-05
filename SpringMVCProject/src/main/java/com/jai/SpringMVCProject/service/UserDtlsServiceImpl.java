package com.jai.SpringMVCProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jai.SpringMVCProject.dao.UserDtlsDao;
import com.jai.SpringMVCProject.model.UserDetails;

@Service
public class UserDtlsServiceImpl implements UserDtlsService{
	
	@Autowired
	UserDtlsDao userDtlsDao;

	@Override
	@Transactional
	public List<UserDetails> getUserDetails() {
		return userDtlsDao.getUserDtls();
	}

	@Override
	@Transactional
	public void saveUserDtls(UserDetails userDtls) {
		userDtlsDao.saveUserDtls(userDtls);
		
		
	}

	@Override
	@Transactional
	public UserDetails getUserDtls(int user_id) {
		return userDtlsDao.getUserDtls(user_id);
	}

	@Override
	@Transactional
	public void deleteUserDtls(int user_id) {
		userDtlsDao.deleteUserDtls(user_id);
		
	}

}
