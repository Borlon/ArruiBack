package com.umu.arrui.service;

import java.util.List;

import com.umu.arrui.domain.Arrui;
import com.umu.arrui.service.domain.ArruiSrvDTO;

public interface IArruiService {

	List<ArruiSrvDTO> findAll();
	Arrui save (Arrui arrui);
}
