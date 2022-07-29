package com.uce.edu.demo.agencia.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
public class Localidad {

	@Id
	@Column(name = "loca_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loca_id_seq")
	@SequenceGenerator(name = "loca_id_seq", sequenceName = "loca_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "loca_ubicacion")
	private String ubicacion;

	@ManyToOne
	@JoinColumn(name = "loca_prov_id")
	private Provincia provincia;

	@OneToMany(mappedBy = "localidad")
	private List<Empleado> empleados;

	@Override
	public String toString() {
		return "Localidad [id=" + id + ", ubicacion=" + ubicacion + "]";
	}
	
	//SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
