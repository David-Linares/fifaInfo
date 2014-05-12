package com.fifa.ubosque.worldcup.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sf;
	
	private static SessionFactory buildSessionFactory(String filename){
		sf = new Configuration().configure(filename).buildSessionFactory();
		return sf;
	}

	public static SessionFactory getSf(String filename) {
		sf = buildSessionFactory(filename);
		return sf;
	}
	

}
