package com.artistas.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artistas.api.dao.UserDao;
import com.artistas.api.models.UserModel;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserModel findByUserId(Long userId) {
		return userDao.findByUserId(userId).orElse(null);
	}

}
