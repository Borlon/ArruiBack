package com.umu.arrui.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.umu.arrui.domain.Arrui;
import com.umu.arrui.repository.ArruiRepository;
import com.umu.arrui.service.IArruiService;

@Service
@Transactional
public class ArruiServiceImpl implements IArruiService {

	@Inject
	private ArruiRepository arruiRepository;
	
	@Override
	public List<Arrui> getAll(){
		return arruiRepository.findAll();
	}

	@Override
	public Arrui save(Arrui arrui) {
		return arruiRepository.save(arrui);
	}

	@Override
	public Arrui getArrui(Long id) {
		Arrui arrui = arruiRepository.findOne(id);
		return arrui;
	}

	@Override
	public void deleteArrui(Long id) {
		arruiRepository.delete(id);
	}
}
