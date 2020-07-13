package com.artistas.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistas.api.models.JwtUser;
import com.artistas.api.models.LoginModel;
import com.artistas.api.models.UserAndLoginModel;
import com.artistas.api.models.UserModel;
import com.artistas.api.security.JwtGenerator;
import com.artistas.api.services.ILoginService;
import com.artistas.api.services.IUserService;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	private JwtGenerator jwtGenerator;
	
	@Autowired
	private ILoginService loginService;
	
	@Autowired
	private IUserService userService;
	
	public LoginController() {
		this.jwtGenerator = new JwtGenerator();
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserAndLoginModel> login(@RequestBody LoginModel login) {
		LoginModel loginServer = loginService.findByUsuario(login.getUsuario());
		
		if (loginServer == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		if (loginServer.getPassword().compareTo(login.getPassword()) != 0) {
			return new ResponseEntity<>(HttpStatus.valueOf(420));
		}
		
		UserModel user = userService.findByUserId(loginServer.getUserId());
		UserAndLoginModel model = new UserAndLoginModel(loginServer, user);
		
		return new ResponseEntity<UserAndLoginModel>(model, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserAndLoginModel> register(@RequestBody UserAndLoginModel model) {
		LoginModel loginServer = loginService.findByUsuario(model.getLogin().getUsuario());
		if (loginServer != null) {
			if (loginServer.getPassword().compareTo(model.getLogin().getPassword()) == 0) {
				return new ResponseEntity<>(HttpStatus.FOUND);
			} else {
				return new ResponseEntity<>(HttpStatus.valueOf(420));
			}
		}

		UserModel userResult = userService.saveUser(model.getUser());
		model.getLogin().setUserId(userResult.getUserId());
		model.getLogin().setToken(generarToken(model.getLogin()));
		
		LoginModel loginResult = loginService.saveLogin(model.getLogin());
		
		return new ResponseEntity<UserAndLoginModel>(new UserAndLoginModel(loginResult, userResult), HttpStatus.CREATED);
	}
	
	private String generarToken(LoginModel login) {
		JwtUser user = new JwtUser();
		user.setUsername(login.getUsuario());
		user.setId(login.getUserId());
		user.setRole("Admin");
		return jwtGenerator.generate(user);
	}
}
