package com.fifa.ubosque.worldcup.logical;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.fifa.ubosque.worldcup.entities.Grupos;
import com.fifa.ubosque.worldcup.util.HibernateUtil;
/*Clase del CRUD de partidos*/

public class PartidosLogica {
	
	private String filename = "hibernate.cfg.xml";
	
	/*Función para consultar Partidos*/
	
	public List consultarPartidos(){
		String sql = "select p from Partidos as p";
		Session session = HibernateUtil.getSf(filename).getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(sql);
		List<Grupos> listaGrupos = query.list();
		session.getTransaction().commit();
		return listaGrupos;
	}
	
	public List consultarFases(){
		return null;
	}
	

}
