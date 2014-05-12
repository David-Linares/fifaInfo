package com.fifa.ubosque.worldcup.beans;

import java.util.List;

import com.fifa.ubosque.worldcup.entities.Equipos;
import com.fifa.ubosque.worldcup.logical.EquiposLogica;

public class EquiposMB {

	private String sigla;
	private String nombre;
	private String dt;
	private int posicion;
	private int eliminatoria;
	private List<Equipos> equipos;
	private EquiposLogica el = new EquiposLogica();
	
	public EquiposMB(){
		super();
		this.setEquipos(el.consultarEquipos());
	}
	
	public List<Equipos> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int getEliminatoria() {
		return eliminatoria;
	}
	public void setEliminatoria(int eliminatoria) {
		this.eliminatoria = eliminatoria;
	}
	
	
	
}
