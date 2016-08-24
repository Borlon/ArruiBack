package com.umu.arrui.service;

import java.util.List;

import com.umu.arrui.domain.Arrui;

public interface IArruiService {

	List<Arrui> getAll();
	Arrui save (Arrui arrui);
	Arrui getArrui(Long id);
}
