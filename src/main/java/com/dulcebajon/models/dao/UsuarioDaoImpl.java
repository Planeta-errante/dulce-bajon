package com.dulcebajon.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dulcebajon.models.Usuario;

@Repository
public class UsuarioDaoImpl implements IUsuarioDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Usuario").getResultList();
	}

	@Override
	@Transactional
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		em.persist(usuario);
	}
	
}

