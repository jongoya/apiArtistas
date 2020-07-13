package com.artistas.api.models;

import java.io.Serializable;

public class UserAndLoginModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private LoginModel login;
	private UserModel user;
	
	public UserAndLoginModel(LoginModel login, UserModel user) {
		super();
		this.login = login;
		this.user = user;
	}

	public LoginModel getLogin() {
		return login;
	}

	public void setLogin(LoginModel login) {
		this.login = login;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}
}
