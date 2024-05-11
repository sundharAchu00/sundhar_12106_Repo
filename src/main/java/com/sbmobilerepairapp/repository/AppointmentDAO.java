package com.sbmobilerepairapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sbmobilerepairapp.entity.Appointment;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class AppointmentDAO implements AppointmentRepo{

	private EntityManager em;

	public AppointmentDAO() {
		super();
	}

	@Autowired
	public AppointmentDAO(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public boolean saveAppointment(Appointment appointment) {
		
		try {
			if (appointment != null) {
				em.persist(appointment);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
