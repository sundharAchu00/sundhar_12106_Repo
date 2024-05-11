package com.sbmobilerepairapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sbmobilerepairapp.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
@Transactional
public class UserDAO  implements UserRepo{

	private EntityManager em;

	public UserDAO() {
		super();
	}

	@Autowired
	public UserDAO(EntityManager em) {
		super();
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAlluEmail() {
		try {
			Query q = em.createQuery("select u.uEmail from User u");
			return q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public User getByuEmail(String uEmail) {
		try {
		 	Query q = em.createQuery("select u from User u where u.uEmail = ?1");
			q.setParameter(1, uEmail);
			return (User)q.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new User();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		try {
			return em.createQuery("select u from User u").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public boolean saveUser(User user) {
		try {
			em.persist(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User getUserById(int id) {
	
		try {
			return em.find(User.class, id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new User();
	}

	
}
