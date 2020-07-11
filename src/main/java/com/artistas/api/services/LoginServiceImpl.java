package com.artistas.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artistas.api.dao.LoginDao;
import com.artistas.api.models.LoginModel;

@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public LoginModel findByLoginId(Long loginId) {
		return (LoginModel) loginDao.findAll();
	}

}
