package com.uce.edu.demo;

import java.math.BigDecimal;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.agencia.repository.IProvinciaRepository;
import com.uce.edu.demo.agencia.repository.modelo.Empleado;
import com.uce.edu.demo.agencia.repository.modelo.Localidad;
import com.uce.edu.demo.agencia.repository.modelo.Provincia;
import com.uce.edu.demo.agencia.service.IEmpleadoFachadaService;
import com.uce.edu.demo.agencia.service.IEmpleadoService;
import com.uce.edu.demo.agencia.service.ILocalidadService;
import com.uce.edu.demo.agencia.service.IProvinciaService;

@SpringBootApplication
public class AgenciaApplication implements CommandLineRunner{
	
	private static final Logger LOGGER = Logger.getLogger(AgenciaApplication.class);
	
	@Autowired
	@Qualifier("Principal")
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IProvinciaService provinciaService;
	
	@Autowired
	private ILocalidadService localidadService;
	
	@Autowired
	private IEmpleadoFachadaService empleadoFachadaService;

	public static void main(String[] args) {
		SpringApplication.run(AgenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Provincia provincia = new Provincia();
		provincia.setProvincia("Quito");
		//this.provinciaService.insertar(provincia);
		
		provincia.setId(1);
		Localidad localidad = new Localidad();
		localidad.setUbicacion("La Ecuatoriana");
		localidad.setProvincia(provincia);
		//this.localidadService.insertar(localidad);
		
		localidad.setId(1);
		Empleado empleado = new Empleado();
		empleado.setNombre("Kevin");
		empleado.setApellido("Chiguano");
		empleado.setSueldo(new BigDecimal(100));
		empleado.setTelefono("123456789");
		empleado.setLocalidad(localidad);
		
		//this.empleadoService.insertar(empleado);
		
		this.empleadoFachadaService.insertarEmpleadoAumento(1, 1);
		
		
	}

}
