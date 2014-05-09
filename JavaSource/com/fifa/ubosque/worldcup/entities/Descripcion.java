package com.fifa.ubosque.worldcup.entities;

// Generated 6/05/2014 08:40:07 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Descripcion generated by hbm2java
 */
@Entity
@Table(name = "descripcion", catalog = "worldcup2014")
public class Descripcion implements java.io.Serializable {

	private Integer id;
	private Partidos partidos;
	private String evento;
	private String momento;

	public Descripcion() {
	}

	public Descripcion(Partidos partidos, String evento, String momento) {
		this.partidos = partidos;
		this.evento = evento;
		this.momento = momento;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_partido", nullable = false)
	public Partidos getPartidos() {
		return this.partidos;
	}

	public void setPartidos(Partidos partidos) {
		this.partidos = partidos;
	}

	@Column(name = "evento", nullable = false, length = 65535)
	public String getEvento() {
		return this.evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	@Column(name = "momento", nullable = false, length = 100)
	public String getMomento() {
		return this.momento;
	}

	public void setMomento(String momento) {
		this.momento = momento;
	}

}