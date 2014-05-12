package com.fifa.ubosque.worldcup.logical;


import com.fifa.ubosque.worldcup.entities.Grupos;
import com.fifa.ubosque.worldcup.util.HibernateUtil;




import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;

public class GruposLogica {
	
	private String filename = "hibernate.cfg.xml";
	
	// Clase encargada ede hacer el CRUD en la bd.

	public boolean crearGrupo(Grupos nuevoGrupo) {
		Session sesion = HibernateUtil.getSf(filename).getCurrentSession();
		sesion.beginTransaction();
		try{
			sesion.persist(nuevoGrupo);
			sesion.getTransaction().commit();
			return true;
		}catch(Exception ex){
			return false;
		}
	}

	public List consultarGrupos() {
		String sql = "select gr from Grupos as gr order by nombre asc";
		Session session = HibernateUtil.getSf(filename).getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(sql);
		List<Grupos> listaGrupos = query.list();
		session.getTransaction().commit();
		return listaGrupos;
	}
	
	public boolean eliminarGrupos(Grupos grupoEliminar) {
		String sql = "delete Grupos where id = :idGrupo";
		Session session = HibernateUtil.getSf(filename).getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(sql);
		query.setParameter("idGrupo", grupoEliminar.getId());
		int eliminado = query.executeUpdate();
		session.getTransaction().commit();
		if(eliminado == 1){
			return true;
		}else{
			return false;
		}
	}
	
	public void editarGrupo(){
	}
}
