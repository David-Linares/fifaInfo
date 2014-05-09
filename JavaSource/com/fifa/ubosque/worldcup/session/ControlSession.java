package com.fifa.ubosque.worldcup.session;

import com.fifa.ubosque.worldcup.entities.Usuarios;

public class ControlSession {
	
	private Usuarios usuario;
	private boolean logueado;
	
	public ControlSession() {
		
	}

	public ControlSession(Usuarios usuario, boolean logueado) {
		super();
		this.usuario = usuario;
		this.logueado = logueado;
	}

	public Usuarios getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
	public boolean isLogueado() {
		return logueado;
	}
	
	public void setLogueado(boolean logueado) {
		this.logueado = logueado;
	}
	
}
