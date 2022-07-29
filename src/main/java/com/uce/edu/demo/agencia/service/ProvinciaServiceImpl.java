package com.uce.edu.demo.agencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.repository.IProvinciaRepository;
import com.uce.edu.demo.agencia.repository.modelo.Provincia;

@Service
public class ProvinciaServiceImpl implements IProvinciaService{

	@Autowired
	private IProvinciaRepository provinciaRepository;
	
	@Override
	public void insertar(Provincia provincia) {
		// TODO Auto-generated method stub
		this.provinciaRepository.insertar(provincia);
	}

	@Override
	public Provincia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.provinciaRepository.buscar(id);
	}

	@Override
	public void actualizar(Provincia provincia) {
		// TODO Auto-generated method stub
		this.provinciaRepository.actualizar(provincia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.provinciaRepository.eliminar(id);
	}

}
