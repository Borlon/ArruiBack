package com.umu.arrui.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "genero")
	private Boolean genero;

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

	@OneToOne(cascade = CascadeType.ALL)
	private Medidas medidas;

	@OneToOne(cascade = CascadeType.ALL)
	private DeterminacionEdad determinacionEdad;

	@Column(name = "oestrus_activo")
	private Boolean oestrusActivo;

	@Column(name = "mucosidad")
	private Boolean mucosidad;

	@Column(name = "observaciones_mucosidad")
	private String observacionesMuco;

	@Column(name = "numero_larvas")
	private Integer numeroLarvas;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Oestrus> oestrus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getGenero() {
		return genero;
	}

	public void setGenero(Boolean genero) {
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

	public Medidas getMedidas() {
		return medidas;
	}

	public void setMedidas(Medidas medidas) {
		this.medidas = medidas;
	}

	public DeterminacionEdad getDeterminacionEdad() {
		return determinacionEdad;
	}

	public void setDeterminacionEdad(DeterminacionEdad determinacionEdad) {
		this.determinacionEdad = determinacionEdad;
	}

	public Boolean getOestrusActivo() {
		return oestrusActivo;
	}

	public void setOestrusActivo(Boolean oestrusActivo) {
		this.oestrusActivo = oestrusActivo;
	}

	public Boolean getMucosidad() {
		return mucosidad;
	}

	public void setMucosidad(Boolean mucosidad) {
		this.mucosidad = mucosidad;
	}

	public String getObservacionesMuco() {
		return observacionesMuco;
	}

	public void setObservacionesMuco(String observacionesMuco) {
		this.observacionesMuco = observacionesMuco;
	}

	public Integer getNumeroLarvas() {
		return numeroLarvas;
	}

	public void setNumeroLarvas(Integer numeroLarvas) {
		this.numeroLarvas = numeroLarvas;
	}

	public List<Oestrus> getOestrus() {
		return oestrus;
	}

	public void setOestrus(List<Oestrus> oestrus) {
		this.oestrus = oestrus;
	}

}
