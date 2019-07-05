package com.jai.SpringMVCProject.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jai.SpringMVCProject.model.UserDetails;

@Repository
public class UserDtlsDaoImpl implements UserDtlsDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<UserDetails> getUserDtls() {
		
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery <UserDetails> criteriaQuery= criteriaBuilder.createQuery(UserDetails.class);
		Root <UserDetails> root = criteriaQuery.from(UserDetails.class);
		criteriaQuery.select(root);
		
		Query query = session.createQuery(criteriaQuery);
		
		return query.getResultList();
	}

	@Override
	public void saveUserDtls(UserDetails userDtls) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(userDtls);
		
	}

	@Override
	public UserDetails getUserDtls(int user_id) {
		Session currentsession = sessionFactory.getCurrentSession();
		UserDetails getUser = currentsession.get(UserDetails.class, user_id);
		return getUser;
	}

	@Override
	public void deleteUserDtls(int user_id) {
		Session currentSession =  sessionFactory.getCurrentSession();
		UserDetails delUser = currentSession.byId(UserDetails.class).load(user_id);
		currentSession.delete(delUser);
	}

}
