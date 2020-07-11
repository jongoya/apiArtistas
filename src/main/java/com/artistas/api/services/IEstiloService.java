package com.artistas.api.services;

import java.util.ArrayList;

import com.artistas.api.models.EstiloModel;

public interface IEstiloService {
	public ArrayList<EstiloModel> findAll();
	public EstiloModel findByEstiloId(Long estiloId);
}
