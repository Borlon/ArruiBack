package com.umu.arrui.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MedidasCuerno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4170949944312894211L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "longitud")
	private Long longitud;

	@Column(name = "contorno")
	private Long contorno;

	@Column(name = "numero_anillos")
	private Integer numeroAnillos;

	@Column(name = "medrones")
	private Long medrones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLongitud() {
		return longitud;
	}

	public void setLongitud(Long longitud) {
		this.longitud = longitud;
	}

	public Long getContorno() {
		return contorno;
	}

	public void setContorno(Long contorno) {
		this.contorno = contorno;
	}

	public Integer getNumeroAnillos() {
		return numeroAnillos;
	}

	public void setNumeroAnillos(Integer numeroAnillos) {
		this.numeroAnillos = numeroAnillos;
	}

	public Long getMedrones() {
		return medrones;
	}

	public void setMedrones(Long medrones) {
		this.medrones = medrones;
	}

}
