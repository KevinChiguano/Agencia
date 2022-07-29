package com.uce.edu.demo.agencia.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.repository.modelo.Empleado;

@Repository
@Transactional
public class EmpleadoRepositoryImpl implements IEmpleadoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado empleado = this.buscar(id);
		this.entityManager.remove(empleado);
	}

	@Override
	public Empleado buscarEmpleadoPorProvincia(Integer id) {
		// TODO Auto-generated method stub
		
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery("SELECT e FROM Empleado e,Localidad l,Provincia p WHERE  e.id = :datoId AND p.id = l.provincia.id AND e.id = e.localidad.id", Empleado.class);
		myQuery.setParameter("datoId", id);
		return myQuery.getSingleResult();
	}

}
