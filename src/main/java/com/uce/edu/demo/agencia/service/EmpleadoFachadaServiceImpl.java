package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.repository.IEmpleadoRepository;
import com.uce.edu.demo.agencia.repository.IProvinciaRepository;
import com.uce.edu.demo.agencia.repository.modelo.Empleado;
import com.uce.edu.demo.agencia.repository.modelo.Provincia;

@Service
public class EmpleadoFachadaServiceImpl implements IEmpleadoFachadaService{

	@Autowired
	@Qualifier("Quito")
	private IEmpleadoService empleadoServiceQuito;
	
	@Autowired
	@Qualifier("Guayaquil")
	private IEmpleadoService empleadoServiceGuayaquil;
	
	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Autowired
	private IProvinciaRepository provinciaRepository;
	
	@Override
	public void insertarEmpleadoAumento(Integer idEmpleado, Integer idProvincia) {
		// TODO Auto-generated method stub
		
		Empleado empleadoAumento = this.empleadoRepository.buscarEmpleadoPorProvincia(idProvincia);
		Provincia provincia = this.provinciaRepository.buscarProvinciaPorEmpleado(idProvincia);
		BigDecimal salario = new BigDecimal(0);
		
		if(provincia.getProvincia().equals("Quito")) {
			salario = this.empleadoServiceQuito.calcularSalario(empleadoAumento.getSueldo());
		}else if(provincia.getProvincia().equals("Guayaquil")){
			salario = this.empleadoServiceGuayaquil.calcularSalario(empleadoAumento.getSueldo());
		}
		
		empleadoAumento.setSueldo(salario);
		this.empleadoRepository.actualizar(empleadoAumento);
	}

}
