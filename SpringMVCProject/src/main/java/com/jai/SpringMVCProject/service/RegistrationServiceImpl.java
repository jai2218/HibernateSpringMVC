package com.jai.SpringMVCProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jai.SpringMVCProject.dao.RegistrationDAO;
import com.jai.SpringMVCProject.model.Registration;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	
	@Autowired
	RegistrationDAO registrationDAO;

	@Override
	@Transactional
	public List<Registration> getRegistrationDtls() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void saveRegistrationDtls(Registration register) {
		registrationDAO.saveRegistrationDtls(register);
		
	}

	@Override
	@Transactional
	public Registration getRegisterDtls(int reg_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void updateRegistrationDtls(Registration register) {
		// TODO Auto-generated method stub
		
	}

}
