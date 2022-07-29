package com.uce.edu.demo.agencia.service;

import com.uce.edu.demo.agencia.repository.modelo.Provincia;

public interface IProvinciaService {

	public void insertar(Provincia provincia);
	public Provincia buscar(Integer id);
	public void actualizar(Provincia provincia);
	public void eliminar(Integer id);
	
}
