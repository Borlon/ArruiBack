package com.umu.arrui.rest;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umu.arrui.service.IArruiServiceTest;

@RestController
@RequestMapping("/test")
public class ArruiTest {
	
	@Inject
	private IArruiServiceTest arruiServiceTest;
	
	@RequestMapping(value="/testNewArrui")
	@CrossOrigin
	public void createArruiTest() {
		arruiServiceTest.createArrui();
	}
}
