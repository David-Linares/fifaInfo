package com.fifa.ubosque.worldcup.logical;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.fifa.ubosque.worldcup.entities.Equipos;
import com.fifa.ubosque.worldcup.entities.Estadios;
import com.fifa.ubosque.worldcup.util.HibernateUtil;

public class EquiposLogica {
	
	private String filename = "hibernate.cfg.xml";
	
	public void crearEquipo(Equipos nuevoEquipo) {

	}

	public List consultarEquipos() {

		String sql = "select e from Equipos as e";

		Session session = HibernateUtil.getSf(filename).getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery(sql);

		List<Estadios> listaEquipos = query.list();

		session.getTransaction().commit();

		return listaEquipos;
	}

	public void eliminarEquipo(Equipos equipo) {

	}

	public void modificarEquipo(Equipos equipoModificado) {

	}

}
