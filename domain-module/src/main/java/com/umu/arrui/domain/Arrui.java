package com.umu.arrui.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arrui")
public class Arrui implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 739360097427142787L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "genero")
	private String genero;

	@Column(name = "edad")
	private String edad;

	@Column(name = "fecha_captura")
	private Date fechaCaptura;

	@Column(name = "fecha_recogida")
	private Date fechaRecogida;

	@Column(name = "zona_captura")
	private String zonaCaptura;

	@Column(name = "observaciones", length = 255)
	private String observaciones;

	public Arrui() {
		super();
	}

	public Arrui(long id, String name, String genero, String edad, Date fechaCaptura, Date fechaRecogida,
			String zonaCaptura, String observaciones) {
		super();
		this.id = id;
		this.name = name;
		this.genero = genero;
		this.edad = edad;
		this.fechaCaptura = fechaCaptura;
		this.fechaRecogida = fechaRecogida;
		this.zonaCaptura = zonaCaptura;
		this.observaciones = observaciones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Date getFechaCaptura() {
		return fechaCaptura;
	}

	public void setFechaCaptura(Date fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}

	public Date getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	public String getZonaCaptura() {
		return zonaCaptura;
	}

	public void setZonaCaptura(String zonaCaptura) {
		this.zonaCaptura = zonaCaptura;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
