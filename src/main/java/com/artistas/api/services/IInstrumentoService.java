package com.artistas.api.services;

import java.util.ArrayList;

import com.artistas.api.models.InstrumentoModel;

public interface IInstrumentoService {
	public ArrayList<InstrumentoModel> findAll();
	public InstrumentoModel findByInstrumentoId(Long instrumentoId);
}
