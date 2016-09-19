package com.umu.arrui.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.umu.arrui.domain.Arrui;
import com.umu.arrui.domain.CuernoDerecho;
import com.umu.arrui.domain.CuernoIzquierdo;
import com.umu.arrui.domain.Denticion;
import com.umu.arrui.domain.DeterminacionEdad;
import com.umu.arrui.domain.LocalizacionDrch;
import com.umu.arrui.domain.LocalizacionIzq;
import com.umu.arrui.domain.Medidas;
import com.umu.arrui.domain.Oestrus;
import com.umu.arrui.service.IArruiService;
import com.umu.arrui.service.IArruiServiceTest;

@Service
@Transactional
public class ArruiServiceTestImpl implements IArruiServiceTest{
	
	@Inject
	private IArruiService arruiService;
	
	@Override
	public void createArrui(){
		
		Arrui arruiTest = new Arrui();
		
		Medidas medidas = new Medidas();
		
		DeterminacionEdad detEdad = new DeterminacionEdad();
		
		Oestrus oestru = new Oestrus();
		List<Oestrus> oestrusList = new ArrayList<Oestrus>();
		
		arruiTest.setName("Arrui1");
		arruiTest.setGenero(true);
		arruiTest.setEdad("2");
		arruiTest.setFechaCaptura(new Date());
		arruiTest.setFechaRecogida(new Date());
		arruiTest.setMucosidad(false);
		arruiTest.setNumeroLarvas(20);
		arruiTest.setObservaciones("Prueba inserción arrui");
		arruiTest.setObservacionesMuco("Ninguna");
		arruiTest.setOestrusActivo(true);
		arruiTest.setZonaCaptura("Badajoz");
		
		medidas.setCuernoHocico(10.5);
		medidas.setEntreArcos(5.0);
		medidas.setEntreCuernos(7.4);
		medidas.setCuernoDerecho(new CuernoDerecho());
		medidas.setCuernoIzquierdo(new CuernoIzquierdo());
		
		arruiTest.setMedidas(medidas);
		
		detEdad.setCategoEdad("Categoria Edad");
		detEdad.setEdad(2);
		detEdad.setObservaciones("observaciones determinacion edad");
		detEdad.setDenticion(new Denticion());
		
		arruiTest.setDeterminacionEdad(detEdad);
		
		oestru.setLocalizacionDerecha(new LocalizacionDrch());
		oestru.setLocalizacionIzquierda(new LocalizacionIzq());
		oestru.setTipo(2);
		oestrusList.add(oestru);
		
		arruiTest.setOestrus(oestrusList);
		
		arruiService.save(arruiTest);
	}
}
