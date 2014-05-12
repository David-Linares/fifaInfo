package com.fifa.ubosque.worldcup.logical;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Hibernate;

import com.fifa.ubosque.worldcup.entities.Usuarios;
import com.fifa.ubosque.worldcup.util.HibernateUtil;
import com.fifa.ubosque.worldcup.session.*;

public class IniciarSesion {
	
	private String filename = "hibernate.cfg.xml";
	
	public List login(String nick, String pass){
		String consulta = "select u from Usuarios as u where nick = '"+nick+"' and contrasena = '"+pass+"'";
		
		Session session = HibernateUtil.getSf(filename).getCurrentSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery(consulta);
		
		List<Usuarios> usuarioLoginData = query.list();
		
		session.getTransaction().commit();
		
		return usuarioLoginData;
		
	}
	
	public void setSesion(List<Usuarios> usuario){
		for (Iterator iterator = usuario.iterator(); iterator.hasNext();) {
			Usuarios usuarioSesion = (Usuarios) iterator.next();
			ControlSession nuevaSesion = new ControlSession(usuarioSesion, true);
		}
		
	}
	
}
