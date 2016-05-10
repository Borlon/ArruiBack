package com.umu.arrui.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umu.arrui.service.IArruiService;
import com.umu.arrui.service.domain.ArruiSrvDTO;

@RestController
@RequestMapping("/api")
public class ArruiResource {

	@Inject
	private IArruiService arruiService;
	
	@RequestMapping(value = "/arrui", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ArruiSrvDTO> getAll() {
		return arruiService.findAll();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    String home() {
        return "HOLA SPRING-BOOT";
    }
}
