package com.dulcebajon.models.dao;

import java.util.List;

import com.dulcebajon.models.Mensaje;

public interface IMensajeDao {

	public List<Mensaje> findAll();

	public void save(Mensaje mensaje);

}
