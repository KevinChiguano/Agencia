package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import com.uce.edu.demo.agencia.repository.modelo.Empleado;

public interface IEmpleadoService {

	public void insertar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void actualizar(Empleado empleado);
	public void eliminar(Integer id);
	
	public BigDecimal calcularSalario(BigDecimal salario);
	
}
