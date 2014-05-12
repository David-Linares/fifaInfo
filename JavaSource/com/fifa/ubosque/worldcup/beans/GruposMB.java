package com.fifa.ubosque.worldcup.beans;

import java.util.List;

import com.fifa.ubosque.worldcup.entities.Grupos;
import com.fifa.ubosque.worldcup.logical.GruposLogica;

public class GruposMB {

	private String nombre;
	private int id;
	private List<Grupos> listaGrupos;
	GruposLogica gl = new GruposLogica();
	Grupos grupoSeleccionado;
	private String success;
	private String error;
	
	private void resetCampos(){
		this.setError(null);
		this.setSuccess(null);
		this.setNombre(null);
		this.setGrupoSeleccionado(null);
	}
	
	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Grupos getGrupoSeleccionado() {
		return grupoSeleccionado;
	}

	public void setGrupoSeleccionado(Grupos grupoSeleccionado) {
		this.grupoSeleccionado = grupoSeleccionado;
	}

	public List<Grupos> getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(List<Grupos> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public GruposMB() {
		super();
		this.consultarGrupos();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void crearGrupos() {
		Grupos nuevoGrupo = new Grupos();
		nuevoGrupo.setNombre(nombre);
		if(gl.crearGrupo(nuevoGrupo)){
			this.setSuccess("Grupo Añadido a la lista!");
			this.consultarGrupos();
			this.resetCampos();
		}else {
			this.setError("Se presentó un error, Inténtelo más tarde");
		}
	}

	public void consultarGrupos() {
		this.setListaGrupos(gl.consultarGrupos());
	}

	public void eliminarGrupo() {
		gl.eliminarGrupos(this.getGrupoSeleccionado());
		this.consultarGrupos();
	}

	public void editarGrupo() {

	}
}
