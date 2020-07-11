package com.artistas.api.services;

import com.artistas.api.models.UserModel;

public interface IUserService {
	public UserModel findByUserId(Long userId);
}
