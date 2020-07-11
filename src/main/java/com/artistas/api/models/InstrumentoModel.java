package com.artistas.api.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instrumento")
public class InstrumentoModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instrumentoId;
	private String nombre;
	
	
	public InstrumentoModel() {
		super();
	}

	public Long getInstrumentoId() {
		return instrumentoId;
	}

	public void setInstrumentoId(Long instrumentoId) {
		this.instrumentoId = instrumentoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private static final long serialVersionUID = 1L;
}
