package com.artistas.api.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.artistas.api.models.InstrumentoModel;

public interface InstrumentoDao extends CrudRepository<InstrumentoModel, Long> {
	public Optional<InstrumentoModel> findByInstrumentoId(Long instrumentoId);
}
