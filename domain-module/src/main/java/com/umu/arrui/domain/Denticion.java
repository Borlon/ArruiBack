package com.umu.arrui.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "denticion")
public class Denticion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1658122505889701539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "dientes_leche")
	private int dientesLeche;
	
	@Column(name = "dientes_permanentes")
	private int dientesPermanentes;
	
	@Column(name = "observaciones")
	private String observaciones;

	public Denticion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Denticion(long id, int dientesLeche, int dientesPermanentes, String observaciones) {
		super();
		this.id = id;
		this.dientesLeche = dientesLeche;
		this.dientesPermanentes = dientesPermanentes;
		this.observaciones = observaciones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDientesLeche() {
		return dientesLeche;
	}

	public void setDientesLeche(int dientesLeche) {
		this.dientesLeche = dientesLeche;
	}

	public int getDientesPermanentes() {
		return dientesPermanentes;
	}

	public void setDientesPermanentes(int dientesPermanentes) {
		this.dientesPermanentes = dientesPermanentes;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
}
