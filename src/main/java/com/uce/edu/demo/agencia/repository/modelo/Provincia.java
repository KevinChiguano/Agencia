package com.uce.edu.demo.agencia.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia {

	@Id
	@Column(name = "prov_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prov_id_seq")
	@SequenceGenerator(name = "prov_id_seq", sequenceName = "prov_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "prov_provincia")
	private String provincia;

	@OneToMany(mappedBy = "provincia")
	private List<Localidad> localidades;

	
	
	@Override
	public String toString() {
		return "Provincia [id=" + id + ", provincia=" + provincia + "]";
	}

	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}

}
