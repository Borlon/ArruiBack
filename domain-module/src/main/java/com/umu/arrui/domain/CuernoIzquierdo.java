package com.umu.arrui.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cuerno_izquierdo")
public class CuernoIzquierdo extends Cuerno{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
}
