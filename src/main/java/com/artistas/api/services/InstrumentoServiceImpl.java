package com.artistas.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artistas.api.dao.InstrumentoDao;
import com.artistas.api.models.InstrumentoModel;

@Service
public class InstrumentoServiceImpl implements IInstrumentoService {
	
	@Autowired
	private InstrumentoDao instrumentoDao;

	@Override
	public ArrayList<InstrumentoModel> findAll() {
		return (ArrayList<InstrumentoModel>) instrumentoDao.findAll();
	}

	@Override
	public InstrumentoModel findByInstrumentoId(Long instrumentoId) {
		return instrumentoDao.findByInstrumentoId(instrumentoId).orElse(null);
	}

}
