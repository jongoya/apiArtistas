package com.artistas.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artistas.api.dao.EstiloDao;
import com.artistas.api.models.EstiloModel;

@Service
public class EstiloServiceImpl implements IEstiloService {
	
	@Autowired
	private EstiloDao estiloDao;
	
	@Override
	public ArrayList<EstiloModel> findAll() {
		return (ArrayList<EstiloModel>) estiloDao.findAll();
	}

	@Override
	public EstiloModel findByEstiloId(Long estiloId) {
		return estiloDao.findByEstiloId(estiloId).orElse(null);
	}

}
