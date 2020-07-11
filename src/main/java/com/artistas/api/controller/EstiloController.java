package com.artistas.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistas.api.models.EstiloModel;
import com.artistas.api.services.IEstiloService;

@RestController
@RequestMapping("/api")
public class EstiloController {
	
	@Autowired
	private IEstiloService estiloService;
	
	@GetMapping("/get_estilos")
	public ResponseEntity<ArrayList<EstiloModel>> getEstilos() {
		ArrayList<EstiloModel> estilos = estiloService.findAll();
		
		return new ResponseEntity<>(estilos, HttpStatus.OK);
	}
}
