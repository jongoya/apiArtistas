package com.artistas.api.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.artistas.api.models.EstiloModel;

public interface EstiloDao extends CrudRepository<EstiloModel, Long> {
	public Optional<EstiloModel> findByEstiloId(Long estiloId);
}
