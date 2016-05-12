package com.umu.arrui.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Localizacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -820649763227243194L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "sen_Fron_Cau_Div_Cornual")
	private int senFronCauDivCornual;

	@Column(name = "sen_Fron_Cau_Div_Postorbitario")
	private int senFronCauDivPostorbitario;

	@Column(name = "sen_Fron_Cau_Div_Nasal")
	private int senFronCauDivNasal;

	@Column(name = "sen_Fron_Ros_Lateral")
	private int senFronRosLateral;

	@Column(name = "sen_Fron_Ros_Media")
	private int senFronRosMedia;

	@Column(name = "sens_Fron_Ros_Medial")
	private int sensFronRosMedial;

	@Column(name = "meato_Dorsal")
	private int meatoDorsal;

	@Column(name = "meato_Medio")
	private int meatoMedio;

	@Column(name = "meato_Ventral")
	private int meatoVentral;

	@Column(name = "turbinados_Etmoides")
	private int turbinadosEtmoides;

	@Column(name = "concha_Dorsal")
	private int conchaDorsal;

	@Column(name = "concha_Ventral")
	private int conchaVentral;

	@Column(name = "seno_Maxilar")
	private int senoMaxilar;

	@Column(name = "seno_Palatino")
	private int senoPalatino;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSenFronCauDivCornual() {
		return senFronCauDivCornual;
	}

	public void setSenFronCauDivCornual(int senFronCauDivCornual) {
		this.senFronCauDivCornual = senFronCauDivCornual;
	}

	public int getSenFronCauDivPostorbitario() {
		return senFronCauDivPostorbitario;
	}

	public void setSenFronCauDivPostorbitario(int senFronCauDivPostorbitario) {
		this.senFronCauDivPostorbitario = senFronCauDivPostorbitario;
	}

	public int getSenFronCauDivNasal() {
		return senFronCauDivNasal;
	}

	public void setSenFronCauDivNasal(int senFronCauDivNasal) {
		this.senFronCauDivNasal = senFronCauDivNasal;
	}

	public int getSenFronRosLateral() {
		return senFronRosLateral;
	}

	public void setSenFronRosLateral(int senFronRosLateral) {
		this.senFronRosLateral = senFronRosLateral;
	}

	public int getSenFronRosMedia() {
		return senFronRosMedia;
	}

	public void setSenFronRosMedia(int senFronRosMedia) {
		this.senFronRosMedia = senFronRosMedia;
	}

	public int getSensFronRosMedial() {
		return sensFronRosMedial;
	}

	public void setSensFronRosMedial(int sensFronRosMedial) {
		this.sensFronRosMedial = sensFronRosMedial;
	}

	public int getMeatoDorsal() {
		return meatoDorsal;
	}

	public void setMeatoDorsal(int meatoDorsal) {
		this.meatoDorsal = meatoDorsal;
	}

	public int getMeatoMedio() {
		return meatoMedio;
	}

	public void setMeatoMedio(int meatoMedio) {
		this.meatoMedio = meatoMedio;
	}

	public int getMeatoVentral() {
		return meatoVentral;
	}

	public void setMeatoVentral(int meatoVentral) {
		this.meatoVentral = meatoVentral;
	}

	public int getTurbinadosEtmoides() {
		return turbinadosEtmoides;
	}

	public void setTurbinadosEtmoides(int turbinadosEtmoides) {
		this.turbinadosEtmoides = turbinadosEtmoides;
	}

	public int getConchaDorsal() {
		return conchaDorsal;
	}

	public void setConchaDorsal(int conchaDorsal) {
		this.conchaDorsal = conchaDorsal;
	}

	public int getConchaVentral() {
		return conchaVentral;
	}

	public void setConchaVentral(int conchaVentral) {
		this.conchaVentral = conchaVentral;
	}

	public int getSenoMaxilar() {
		return senoMaxilar;
	}

	public void setSenoMaxilar(int senoMaxilar) {
		this.senoMaxilar = senoMaxilar;
	}

	public int getSenoPalatino() {
		return senoPalatino;
	}

	public void setSenoPalatino(int senoPalatino) {
		this.senoPalatino = senoPalatino;
	}

}
