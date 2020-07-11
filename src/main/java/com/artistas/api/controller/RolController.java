package com.artistas.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistas.api.models.RolModel;
import com.artistas.api.services.IRolService;

@RestController
@RequestMapping("/api")
public class RolController {

	@Autowired
	private IRolService rolService;
	
	@GetMapping("/get_rols")
	public ResponseEntity<ArrayList<RolModel>> getRols() {
		ArrayList<RolModel> rols = rolService.findAll();
		
		return new ResponseEntity<>(rols, HttpStatus.OK);
	}
}
