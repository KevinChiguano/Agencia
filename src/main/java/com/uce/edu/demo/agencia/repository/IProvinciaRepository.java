package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.repository.modelo.Empleado;
import com.uce.edu.demo.agencia.repository.modelo.Provincia;

public interface IProvinciaRepository {

	public void insertar(Provincia provincia);
	public Provincia buscar(Integer id);
	public void actualizar(Provincia provincia);
	public void eliminar(Integer id);
	
	public Provincia buscarProvinciaPorEmpleado(Integer id);
	
}
