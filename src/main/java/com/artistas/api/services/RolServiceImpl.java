package com.artistas.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artistas.api.dao.RolDao;
import com.artistas.api.models.RolModel;

@Service
public class RolServiceImpl implements IRolService {
	
	@Autowired
	private RolDao rolDao;

	@Override
	public ArrayList<RolModel> findAll() {
		return (ArrayList<RolModel>) rolDao.findAll();
	}

	@Override
	public RolModel findByRolId(Long rolId) {
		return rolDao.findByRolId(rolId).orElse(null);
	}
}
