package com.fifa.ubosque.worldcup.beans;

import java.util.List;

import com.fifa.ubosque.worldcup.entities.Partidos;
import com.fifa.ubosque.worldcup.logical.PartidosLogica;

public class PartidosMB {
	
	private List<Partidos> listPartidos;
	PartidosLogica pl = new PartidosLogica();
	
	public PartidosMB(){
		this.consultarFases();
	}
	
	
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
		
	}
	
	
}
