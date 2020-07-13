package com.artistas.api.services;

import com.artistas.api.models.LoginModel;

public interface ILoginService {
	public LoginModel findByLoginId(Long loginId);
	public LoginModel findByUsuario(String usuario);
	public LoginModel saveLogin(LoginModel login);
}
