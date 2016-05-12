package com.umu.arrui.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "determinacion_edad")
public class DeterminacionEdad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -931801668754307451L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "edad")
	private long edad;

	@Column(name = "categoria_edad")
	private String categoEdad;

	@Column(name = "observaciones")
	private String observaciones;

	@OneToOne(cascade = CascadeType.ALL)
	private Denticion denticion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getEdad() {
		return edad;
	}

	public void setEdad(long edad) {
		this.edad = edad;
	}

	public String getCategoEdad() {
		return categoEdad;
	}

	public void setCategoEdad(String categoEdad) {
		this.categoEdad = categoEdad;
	}

	public Denticion getDenticion() {
		return denticion;
	}

	public void setDenticion(Denticion denticion) {
		this.denticion = denticion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
