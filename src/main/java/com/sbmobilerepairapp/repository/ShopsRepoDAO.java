package com.sbmobilerepairapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sbmobilerepairapp.entity.Shops;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class ShopsRepoDAO implements ShopsRepo{
	
	private EntityManager em;

	public ShopsRepoDAO() {
		super();
	}

	@Autowired
	public ShopsRepoDAO(EntityManager em) {
		super();
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Shops> getAllShops() {
		try {
			return em.createQuery("select s from Shops s").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public boolean saveShop(Shops shops) {
	
		try {
			em.persist(shops);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
