package com.fifa.ubosque.worldcup.beans;

public class ControlSesionesTemp {
	
	private boolean administrador;
	private boolean coordinador;
	
	public ControlSesionesTemp() {
		super();
		this.administrador = false;
		this.coordinador = false;
	}
	public boolean isAdministrador() {
		return administrador;
	}
	public void setAdministrador() {
		this.administrador = true;
	}
	public boolean isCoordinador() {
		return coordinador;
	}
	public void setCoordinador() {
		this.coordinador = true;
	}
}
