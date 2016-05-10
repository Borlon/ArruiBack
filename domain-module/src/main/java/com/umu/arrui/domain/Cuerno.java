package com.umu.arrui.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Cuerno {
	
	@Column(name="longitud")
	private Integer longitud;
	@Column(name="contorno")
	private Integer contorno;
	@Column(name="numero_anillos")
	private Integer numeroAnillos;
	@Column(name="medrones")
	private Integer medrones;
}
