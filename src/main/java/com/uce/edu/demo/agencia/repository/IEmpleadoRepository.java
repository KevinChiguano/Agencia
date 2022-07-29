package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.repository.modelo.Empleado;

public interface IEmpleadoRepository {
	
	public void insertar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void actualizar(Empleado empleado);
	public void eliminar(Integer id);
	
	public Empleado buscarEmpleadoPorProvincia(Integer id);

}
