package com.uce.edu.demo.agencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.repository.ILocalidadRepository;
import com.uce.edu.demo.agencia.repository.modelo.Localidad;

@Service
public class LocalidadServiceImpl implements ILocalidadService{

	@Autowired
	private ILocalidadRepository localidadRepository;
	
	@Override
	public void insertar(Localidad localidad) {
		// TODO Auto-generated method stub
		this.localidadRepository.insertar(localidad);
	}

	@Override
	public Localidad buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.localidadRepository.buscar(id);
	}

	@Override
	public void actualizar(Localidad localidad) {
		// TODO Auto-generated method stub
		this.localidadRepository.actualizar(localidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.localidadRepository.eliminar(id);
	}

}
