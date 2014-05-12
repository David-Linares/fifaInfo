package com.fifa.ubosque.worldcup.entities;

// Generated 11/05/2014 02:01:12 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Grupos generated by hbm2java
 */
@Entity
@Table(name = "grupos", catalog = "worldcup2014")
public class Grupos implements java.io.Serializable {

	private Integer id;
	private String nombre;

	public Grupos() {
	}

	public Grupos(String nombre) {
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
