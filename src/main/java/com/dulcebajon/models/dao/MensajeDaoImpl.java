package com.dulcebajon.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.dulcebajon.models.Mensaje;

public class MensajeDaoImpl implements IMensajeDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Mensaje> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Mensaje").getResultList();
	}

	@Override
	@Transactional
	public void save(Mensaje mensaje) {
		// TODO Auto-generated method stub
		em.persist(mensaje);
	}

}
