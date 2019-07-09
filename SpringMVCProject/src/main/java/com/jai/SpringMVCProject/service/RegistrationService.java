package com.jai.SpringMVCProject.service;

import java.util.List;

import com.jai.SpringMVCProject.model.Registration;

public interface RegistrationService {
	
	public List<Registration> getRegistrationDtls();
	
	public void saveRegistrationDtls(Registration register);
	
	public Registration getRegisterDtls(int reg_id);
	
	public void updateRegistrationDtls(Registration register);

}
