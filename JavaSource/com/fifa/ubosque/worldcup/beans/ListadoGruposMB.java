package com.fifa.ubosque.worldcup.beans;

import java.util.ArrayList;
import java.util.List;

import com.fifa.ubosque.worldcup.entities.Equipos;
import com.fifa.ubosque.worldcup.entities.Grupos;

public class ListadoGruposMB {
	
	private List<Grupos> listaGrupos;
	private List<Equipos> listaEquipos;
	
	public ListadoGruposMB (){
		listaGrupos = new ArrayList<Grupos>();
		listaEquipos = new ArrayList<Equipos>();
		
		Grupos g1 = new Grupos(1, "Grupo A");
		
		Equipos e1 = new Equipos(1, "Brasil", "Luis Felipe Scolari", "BRA", 1, g1);
		Equipos e2 = new Equipos(1, "Croacia", "Niko Kovač", "CRO", 2, g1);
		Equipos e3 = new Equipos(1, "México", "Miguel Herrera", "MEX", 3, g1);
		Equipos e4 = new Equipos(1, "Camerún", "Volker Finke", "CMR", 4, g1);
		
		listaGrupos.add(g1);
		listaEquipos.add(e1);
		listaEquipos.add(e2);
		listaEquipos.add(e3);
		listaEquipos.add(e4);		
	}
	
	public List<Grupos> getGrupos() {
		return listaGrupos;
	}
	public void setGrupos(List<Grupos> grupos) {
		this.listaGrupos = grupos;
	}
	public List<Equipos> getEquipos() {
		return listaEquipos;
	}
	public void setEquipos(List<Equipos> equipos) {
		this.listaEquipos = equipos;
	}

	public List<Equipos> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(List<Equipos> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public List<Grupos> getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(List<Grupos> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}	
}
