package com.artistas.api.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estilo")
public class EstiloModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estiloId;
	private String nombre;
	
	public EstiloModel() {
		super();
	}

	public Long getEstiloId() {
		return estiloId;
	}

	public void setEstiloId(Long estiloId) {
		this.estiloId = estiloId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private static final long serialVersionUID = 1L;
}
