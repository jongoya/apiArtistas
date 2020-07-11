package com.artistas.api.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.artistas.api.models.LoginModel;

public interface LoginDao extends CrudRepository<LoginModel, Long> {
	public Optional<LoginModel> findByLoginId(Long loginId);
}
