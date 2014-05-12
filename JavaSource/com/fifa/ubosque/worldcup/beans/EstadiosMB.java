package com.fifa.ubosque.worldcup.beans;


import java.util.List;

import com.fifa.ubosque.worldcup.logical.EstadiosLogica;

import com.fifa.ubosque.worldcup.entities.Estadios;

public class EstadiosMB {
	
	private String ruta;
	private List<Estadios> estadios;
	private String nombre_estadio;
	private String sede;
	private int capacidad;
	private String temperatura;
	EstadiosLogica el = new EstadiosLogica();	
	
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
		
	public List<Estadios> getEstadios() {
		return estadios;
	}
	public void setEstadios(List<Estadios> estadios) {
		this.estadios = estadios;
	}
	public String getNombre_estadio() {
		return nombre_estadio;
	}
	public void setNombre_estadio(String nombre_estadio) {
		this.nombre_estadio = nombre_estadio;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public EstadiosMB() {
		super();
		this.setEstadios(el.consultarEstadios());
	}
	
	public void crearEstadio(){
		Estadios e = new Estadios(this.nombre_estadio, this.sede, this.capacidad, this.temperatura);
		el.insertarEstadio(e);
		el.consultarEstadios();
	}

	/*public void editarEstadio(){
		Estadios e = new Estadios(this.nombre_estadio, this.sede, this.capacidad, this.temperatura);
		EstadiosLogica el = new EstadiosLogica();
		el.insertarEstadio(e);
}*/
	
}