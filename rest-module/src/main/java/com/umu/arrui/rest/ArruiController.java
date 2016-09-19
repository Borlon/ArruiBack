package com.umu.arrui.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umu.arrui.domain.Arrui;
import com.umu.arrui.rest.domain.ArruiDTO;
import com.umu.arrui.service.IArruiService;

import ma.glasnost.orika.MapperFacade;

@RestController
@RequestMapping("/api")
public class ArruiController {

	@Inject
	private IArruiService arruiService;
	
	@Inject
	private MapperFacade mapper;
	
	@RequestMapping(value = "/arrui", method = RequestMethod.GET)
	@CrossOrigin
	public List<ArruiDTO> getAll() {
		
		return mapper.mapAsList(arruiService.getAll(), ArruiDTO.class);
	}
	
	@RequestMapping(value="/arrui/{id}", method= RequestMethod.GET)
	@CrossOrigin
	public ArruiDTO getArrui(@PathVariable Long id){
		
		return mapper.map(arruiService.getArrui(id),ArruiDTO.class);
	}
	
	@RequestMapping(value="/arrui", method = RequestMethod.POST)
	@CrossOrigin
	public ArruiDTO createArrui(ArruiDTO dto){
		Arrui arrui = mapper.map(dto, Arrui.class);
		arruiService.save(arrui);
		return mapper.map(arrui, ArruiDTO.class);
	}
	
	@RequestMapping(value="/arrui", method = RequestMethod.PUT)
	@CrossOrigin
	public ArruiDTO updateArrui(@RequestBody ArruiDTO dto){
		Arrui arrui = mapper.map(dto, Arrui.class);
		arruiService.save(arrui);
		return mapper.map(arrui, ArruiDTO.class);
	}
	
	@RequestMapping(value="/arrui/{id}", method = RequestMethod.DELETE)
	@CrossOrigin
	public void deleteArrui(@PathVariable Long id){
		arruiService.deleteArrui(id);
	}
}
