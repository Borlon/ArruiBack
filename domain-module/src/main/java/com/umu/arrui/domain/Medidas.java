package com.umu.arrui.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medidas")
public class Medidas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7865916615114188383L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "entre_arcos")
	private Float entreArcos;
	
	@Column(name = "entre_cuernos")
	private Float entreCuernos;
	
	@Column(name = "cuerno_hocico")
	private Float cuernoHocico;

	public Medidas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medidas(long id, Float entreArcos, Float entreCuernos, Float cuernoHocico) {
		super();
		this.id = id;
		this.entreArcos = entreArcos;
		this.entreCuernos = entreCuernos;
		this.cuernoHocico = cuernoHocico;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Float getEntreArcos() {
		return entreArcos;
	}

	public void setEntreArcos(Float entreArcos) {
		this.entreArcos = entreArcos;
	}

	public Float getEntreCuernos() {
		return entreCuernos;
	}

	public void setEntreCuernos(Float entreCuernos) {
		this.entreCuernos = entreCuernos;
	}

	public Float getCuernoHocico() {
		return cuernoHocico;
	}

	public void setCuernoHocico(Float cuernoHocico) {
		this.cuernoHocico = cuernoHocico;
	}
	
}
