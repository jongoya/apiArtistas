package com.artistas.api.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.artistas.api.models.RolModel;

public interface RolDao extends CrudRepository<RolModel, Long> {
	public Optional<RolModel> findByRolId(Long rolId);
}
