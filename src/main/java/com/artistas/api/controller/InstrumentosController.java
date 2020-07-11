package com.artistas.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistas.api.models.InstrumentoModel;
import com.artistas.api.services.IInstrumentoService;

@RestController
@RequestMapping("/api")
public class InstrumentosController {

	@Autowired
	private IInstrumentoService instrumentoService;
	
	@GetMapping("/get_instrumentos")
	public ResponseEntity<ArrayList<InstrumentoModel>> getInstrumentos() {
		ArrayList<InstrumentoModel> instrumentos = instrumentoService.findAll();
		
		return new ResponseEntity<>(instrumentos, HttpStatus.OK);
	}
}
