package com.uce.edu.demo.agencia.service;

import com.uce.edu.demo.agencia.repository.modelo.Localidad;

public interface ILocalidadService {

	public void insertar(Localidad localidad);
	public Localidad buscar(Integer id);
	public void actualizar(Localidad localidad);
	public void eliminar(Integer id);
	
}
