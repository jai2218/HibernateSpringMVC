package com.jai.SpringMVCProject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jai.SpringMVCProject.model.Registration;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Registration> getRegistrationDtls() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRegistrationDtls(Registration register) {
		Session currentsession = sessionFactory.getCurrentSession();
		//currentsession.beginTransaction().begin();
		currentsession.saveOrUpdate(register);
		//currentsession.close();
		
	}

	@Override
	public Registration getRegisterDtls(int reg_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRegistrationDtls(Registration register) {
		// TODO Auto-generated method stub
		
	}

}
