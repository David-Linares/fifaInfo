package com.fifa.ubosque.worldcup.beans;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.fifa.ubosque.worldcup.entities.Usuarios;
import com.fifa.ubosque.worldcup.logical.IniciarSesion;

public class Ingreso{
	
	private String usuarioLogin;
	private String passwordLogin;
	private String error;
	private boolean mostrarError = false;
	
	public boolean isMostrarError() {
		return mostrarError;
	}

	private List<Usuarios> usuarioSesion;
	
	public List<Usuarios> getUsuarioSesion() {
		return usuarioSesion;
	}

	public void setUsuarioSesion(List<Usuarios> usuarioSesion) {
		this.usuarioSesion = usuarioSesion;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
		this.mostrarError = true;
	}
	
	public Ingreso(){
	}

	public String getUsuarioLogin() {
		return usuarioLogin;
	}
	
	public void setUsuarioLogin(String usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}
	
	public String getPasswordLogin() {
		return passwordLogin;
	}
	
	public void setPasswordLogin(String passwordLogin) {
		this.passwordLogin = passwordLogin;
	}
	
	public String iniciarSesion(){
		
		if (this.usuarioLogin == "" || this.passwordLogin == "") {
			return null;
		}
		
		IniciarSesion nuevaSesion = new IniciarSesion();
		
		usuarioSesion = nuevaSesion.login(this.usuarioLogin, this.passwordLogin);
		
		if (!usuarioSesion.isEmpty()) {
			nuevaSesion.setSesion(usuarioSesion);
			return "iniciarSesion";
		}else{
			this.setError("Usuario o Contraseña Incorrectas");
			return null;
		}
	}

}
