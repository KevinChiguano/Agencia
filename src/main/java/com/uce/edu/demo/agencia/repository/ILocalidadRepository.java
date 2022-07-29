package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.repository.modelo.Localidad;

public interface ILocalidadRepository {

	public void insertar(Localidad localidad);
	public Localidad buscar(Integer id);
	public void actualizar(Localidad localidad);
	public void eliminar(Integer id);
}
