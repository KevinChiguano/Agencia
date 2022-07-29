package com.uce.edu.demo.agencia.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.repository.modelo.Localidad;

@Repository
@Transactional
public class LocalidadRepositoryImpl implements ILocalidadRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Localidad localidad) {
		// TODO Auto-generated method stub
		this.entityManager.persist(localidad);
	}

	@Override
	public Localidad buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Localidad.class, id);
	}

	@Override
	public void actualizar(Localidad localidad) {
		// TODO Auto-generated method stub
		this.entityManager.merge(localidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Localidad localidad = this.buscar(id);
		this.entityManager.remove(localidad);
	}

}
