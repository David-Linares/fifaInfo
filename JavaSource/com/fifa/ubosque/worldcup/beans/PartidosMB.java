package com.fifa.ubosque.worldcup.beans;

import java.util.List;

import com.fifa.ubosque.worldcup.entities.Fases;
import com.fifa.ubosque.worldcup.entities.Partidos;
import com.fifa.ubosque.worldcup.logical.PartidosLogica;

public class PartidosMB {
	
	private List<Partidos> listPartidos;
	private List<Fases> listFases;
	private Fases faseSeleccionada;
	
	public Fases getFaseSeleccionada() {
		return faseSeleccionada;
	}

	public void setFaseSeleccionada(Fases faseSeleccionada) {
		this.faseSeleccionada = faseSeleccionada;
	}

	public PartidosMB(){
		this.consultarFases();
	}
	
	public List<Fases> getListFases() {
		return listFases;
	}

	public void setListFases(List<Fases> listFases) {
		this.listFases = listFases;
	}

	PartidosLogica pl = new PartidosLogica();
	
	
	
	public List<Partidos> getListPartidos() {
		return listPartidos;
	}

	public void setListPartidos(List<Partidos> listPartidos) {
		this.listPartidos = listPartidos;
	}
	
	/*Método para consultar partidos*/
	
	public void consultarPartidos(){
		
	} 
	
	public void consultarFases(){
		this.setListFases(pl.consultarFases());
	}
	
	
}
