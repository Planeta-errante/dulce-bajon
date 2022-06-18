package com.dulcebajon.models.dao;

import java.util.List;

import com.dulcebajon.models.Usuario;

public interface IUsuarioDao {

	public List<Usuario> findAll();
	
	public void save(Usuario usuario);
	
}
