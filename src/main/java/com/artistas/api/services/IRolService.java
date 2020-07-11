package com.artistas.api.services;

import java.util.ArrayList;

import com.artistas.api.models.RolModel;

public interface IRolService {
	public ArrayList<RolModel> findAll();
	public RolModel findByRolId(Long rolId);
}
