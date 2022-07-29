package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.repository.modelo.Empleado;

@Service
@Qualifier("Guayaquil")
public class EmpleadoGuayaquilServiceImpl implements IEmpleadoService{

	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularSalario(BigDecimal salario) {
		// TODO Auto-generated method stub
		BigDecimal adicional = salario.multiply(new BigDecimal(20)).divide(new BigDecimal(100));
		BigDecimal salarioFinal = salario.add(adicional);
		
		return salarioFinal;
	}

}
