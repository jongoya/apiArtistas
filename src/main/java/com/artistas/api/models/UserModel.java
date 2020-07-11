package com.artistas.api.models;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String nombre;
    private String apellidos;
    private int edad;
    private long fecha;
    private String correo;
    private String pais;
    private String direccion;
    private Long rol;
    private String nombreArtista;
    private ArrayList<Long> instrumentos = new ArrayList<>();
    private ArrayList<Long> estilos = new ArrayList<>();
    private String paginaWeb;
    private double precio;
    
	public UserModel() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getFecha() {
		return fecha;
	}

	public void setFecha(long fecha) {
		this.fecha = fecha;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getRol() {
		return rol;
	}

	public void setRol(Long rol) {
		this.rol = rol;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public ArrayList<Long> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(ArrayList<Long> instrumentos) {
		this.instrumentos = instrumentos;
	}

	public ArrayList<Long> getEstilos() {
		return estilos;
	}

	public void setEstilos(ArrayList<Long> estilos) {
		this.estilos = estilos;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	private static final long serialVersionUID = 1L;
}
