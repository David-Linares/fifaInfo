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
 * RankingJugadores generated by hbm2java
 */
@Entity
@Table(name = "ranking_jugadores", catalog = "worldcup2014")
public class RankingJugadores implements java.io.Serializable {

	private Integer id;
	private Jugadores jugadores;
	private int golesMarcados;
	private int tarjetasAmarillas;
	private int tarjetasRojas;

	public RankingJugadores() {
	}

	public RankingJugadores(Jugadores jugadores, int golesMarcados,
			int tarjetasAmarillas, int tarjetasRojas) {
		this.jugadores = jugadores;
		this.golesMarcados = golesMarcados;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
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
	@JoinColumn(name = "id_jugador", nullable = false)
	public Jugadores getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(Jugadores jugadores) {
		this.jugadores = jugadores;
	}

	@Column(name = "goles_marcados", nullable = false)
	public int getGolesMarcados() {
		return this.golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	@Column(name = "tarjetas_amarillas", nullable = false)
	public int getTarjetasAmarillas() {
		return this.tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	@Column(name = "tarjetas_rojas", nullable = false)
	public int getTarjetasRojas() {
		return this.tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

}