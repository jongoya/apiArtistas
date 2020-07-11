package com.artistas.api.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.artistas.api.models.UserModel;

public interface UserDao extends CrudRepository<UserModel, Long> {
	public Optional<UserModel> findByUserId(Long userId);
}
