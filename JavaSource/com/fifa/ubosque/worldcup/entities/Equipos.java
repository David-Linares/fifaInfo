package com.fifa.ubosque.worldcup.entities;

public class Equipos {
	
	private int id;
	private String nombre;
	private String tecnico;
	private String sigla;
	private int posicion;
	private Grupos grupo;
	
	public Equipos(int id, String nombre, String tecnico, String sigla,
			int posicion, Grupos grupo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tecnico = tecnico;
		this.sigla = sigla;
		this.posicion = posicion;
		this.grupo = grupo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public Grupos getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupos grupo) {
		this.grupo = grupo;
	}
	
	

}
