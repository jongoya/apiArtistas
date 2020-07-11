package com.artistas.api.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loginId;
	private String ususario;
	private String password;
	private String clave;
	private String token;
	private long userId;
	private boolean active;
	
	public LoginModel() {
		super();
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public String getUsusario() {
		return ususario;
	}

	public void setUsusario(String ususario) {
		this.ususario = ususario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	private static final long serialVersionUID = 1L;
}
