package com.umu.arrui.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "oestrus")
public class Oestrus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -663299495871257606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "tipo")
	private int tipo;

	@OneToOne(cascade = CascadeType.ALL)
	private LocalizacionDrch localizacionDerecha;

	@OneToOne(cascade = CascadeType.ALL)
	private LocalizacionIzq localizacionIzquierda;

//	@ManyToOne
//	@JoinColumn(name="arrui_id", insertable=false, updatable=false, nullable=false)
//	private Arrui arrui;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public LocalizacionDrch getLocalizacionDerecha() {
		return localizacionDerecha;
	}

	public void setLocalizacionDerecha(LocalizacionDrch localizacionDerecha) {
		this.localizacionDerecha = localizacionDerecha;
	}

	public LocalizacionIzq getLocalizacionIzquierda() {
		return localizacionIzquierda;
	}

	public void setLocalizacionIzquierda(LocalizacionIzq localizacionIzquierda) {
		this.localizacionIzquierda = localizacionIzquierda;
	}

}
