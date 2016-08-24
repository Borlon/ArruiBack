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
@Table(name = "medidas")
public class Medidas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7865916615114188383L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "entre_arcos")
	private Double entreArcos;

	@Column(name = "entre_cuernos")
	private Double entreCuernos;

	@Column(name = "cuerno_hocico")
	private Double cuernoHocico;

	@OneToOne(cascade = CascadeType.ALL)
	private CuernoDerecho cuernoDerecho;

	@OneToOne(cascade = CascadeType.ALL)
	private CuernoIzquierdo cuernoIzquierdo;

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getEntreArcos() {
		return entreArcos;
	}

	public void setEntreArcos(Double entreArcos) {
		this.entreArcos = entreArcos;
	}

	public Double getEntreCuernos() {
		return entreCuernos;
	}

	public void setEntreCuernos(Double entreCuernos) {
		this.entreCuernos = entreCuernos;
	}

	public Double getCuernoHocico() {
		return cuernoHocico;
	}

	public void setCuernoHocico(Double cuernoHocico) {
		this.cuernoHocico = cuernoHocico;
	}

	public CuernoDerecho getCuernoDerecho() {
		return cuernoDerecho;
	}

	public void setCuernoDerecho(CuernoDerecho cuernoDerecho) {
		this.cuernoDerecho = cuernoDerecho;
	}

	public CuernoIzquierdo getCuernoIzquierdo() {
		return cuernoIzquierdo;
	}

	public void setCuernoIzquierdo(CuernoIzquierdo cuernoIzquierdo) {
		this.cuernoIzquierdo = cuernoIzquierdo;
	}
}
