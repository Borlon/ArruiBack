package com.umu.arrui.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Cuerno implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4170949944312894211L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="longitud")
	private Integer longitud;
	
	@Column(name="contorno")
	private Integer contorno;
	
	@Column(name="numero_anillos")
	private Integer numeroAnillos;
	
	@Column(name="medrones")
	private Integer medrones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public Integer getContorno() {
		return contorno;
	}

	public void setContorno(Integer contorno) {
		this.contorno = contorno;
	}

	public Integer getNumeroAnillos() {
		return numeroAnillos;
	}

	public void setNumeroAnillos(Integer numeroAnillos) {
		this.numeroAnillos = numeroAnillos;
	}

	public Integer getMedrones() {
		return medrones;
	}

	public void setMedrones(Integer medrones) {
		this.medrones = medrones;
	}
}
