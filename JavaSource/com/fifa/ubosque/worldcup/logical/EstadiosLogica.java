package com.fifa.ubosque.worldcup.logical;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.engine.HibernateIterator;

import com.fifa.ubosque.worldcup.entities.Equipos;
import com.fifa.ubosque.worldcup.entities.Estadios;
import com.fifa.ubosque.worldcup.util.HibernateUtil;


public class EstadiosLogica {
	
	private String filename = "hibernate.cfg.xml";
	
	public EstadiosLogica(){
		
	}
	
	public void insertarEstadio(Estadios nuevoEstadio){
		Session sesion  = HibernateUtil.getSf(filename).getCurrentSession();
		sesion.beginTransaction();
		sesion.persist(nuevoEstadio);
		sesion.getTransaction().commit();
	}
	
	public List consultarEstadios(){
		String sql = "select e from Estadios as e";

		Session session = HibernateUtil.getSf("hibernate2.cfg.xml")
				.getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery(sql);

		List<Estadios> listaEstadios = query.list();

		session.getTransaction().commit();

		return listaEstadios;
}
}
