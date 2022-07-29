package com.uce.edu.demo.agencia.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.repository.modelo.Empleado;
import com.uce.edu.demo.agencia.repository.modelo.Provincia;

@Repository
@Transactional
public class ProvinciaRepositoryImpl implements IProvinciaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Provincia provincia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(provincia);
	}

	@Override
	public Provincia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Provincia.class, id);
	}

	@Override
	public void actualizar(Provincia provincia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(provincia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Provincia provincia = this.buscar(id);
		this.entityManager.remove(provincia);
	}

	@Override
	public Provincia buscarProvinciaPorEmpleado(Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Provincia> myQuery = this.entityManager.createQuery("SELECT p FROM Empleado e,Localidad l,Provincia p WHERE  p.id = :datoId AND p.id = l.provincia.id AND e.id = e.localidad.id", Provincia.class);
		myQuery.setParameter("datoId", id);
		return myQuery.getSingleResult();
	}
}
