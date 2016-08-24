package com.umu.arrui.rest;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umu.arrui.domain.Arrui;
import com.umu.arrui.domain.CuernoDerecho;
import com.umu.arrui.domain.CuernoIzquierdo;
import com.umu.arrui.domain.Medidas;
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
	public List<ArruiDTO> getAll() {
		
		//Codigo para pruebas rapidas. Borrar de aca.
		Arrui arrui = new Arrui();
		arrui.setEdad("5");
		arrui.setFechaCaptura(new Date());
		arrui.setFechaRecogida(new Date());
		arrui.setGenero(true);
		arrui.setName("juanica");
		arrui.setObservaciones("esto es otra una prueba");
		arrui.setZonaCaptura("Madriz");
		
		CuernoDerecho cuernoDerecho = new CuernoDerecho();
		cuernoDerecho.setLongitud(52L);
		cuernoDerecho.setContorno(10L);
		cuernoDerecho.setMedrones(2L);
		cuernoDerecho.setNumeroAnillos(20);
		CuernoIzquierdo cuernoIzquierdo = new CuernoIzquierdo();
		cuernoIzquierdo.setLongitud(52L);
		cuernoIzquierdo.setContorno(10L);
		cuernoIzquierdo.setMedrones(2L);
		cuernoIzquierdo.setNumeroAnillos(20);
		
		Medidas medidas = new Medidas();
		medidas.setCuernoDerecho(cuernoDerecho);
		medidas.setCuernoIzquierdo(cuernoIzquierdo);
		arrui.setMedidas(medidas);
		
		arruiService.save(arrui);
		
		return mapper.mapAsList(arruiService.getAll(), ArruiDTO.class);
	}
	
	@RequestMapping(value="/arrui/{id}", method= RequestMethod.GET)
	public ArruiDTO getArrui(@PathVariable Long id){
		
		return mapper.map(arruiService.getArrui(id),ArruiDTO.class);
	}
}
