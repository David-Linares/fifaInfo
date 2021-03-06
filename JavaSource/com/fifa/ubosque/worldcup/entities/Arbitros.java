package com.fifa.ubosque.worldcup.entities;

// Generated 12/05/2014 04:16:43 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Arbitros generated by hbm2java
 */
@Entity
@Table(name = "arbitros", catalog = "worldcup2014")
public class Arbitros implements java.io.Serializable {

	private Integer id;
	private Pais pais;
	private String nombre;
	private String edad;
	private String posicion;
	private Set<Partidos> partidosesForArbitro2 = new HashSet<Partidos>(0);
	private Set<Partidos> partidosesForArbitro1 = new HashSet<Partidos>(0);
	private Set<Partidos> partidosesForArbitro4 = new HashSet<Partidos>(0);
	private Set<Partidos> partidosesForArbitro3 = new HashSet<Partidos>(0);
	private Set<Partidos> partidosesForArbitro5 = new HashSet<Partidos>(0);

	public Arbitros() {
	}

	public Arbitros(Pais pais, String nombre, String edad, String posicion) {
		this.pais = pais;
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	public Arbitros(Pais pais, String nombre, String edad, String posicion,
			Set<Partidos> partidosesForArbitro2,
			Set<Partidos> partidosesForArbitro1,
			Set<Partidos> partidosesForArbitro4,
			Set<Partidos> partidosesForArbitro3,
			Set<Partidos> partidosesForArbitro5) {
		this.pais = pais;
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.partidosesForArbitro2 = partidosesForArbitro2;
		this.partidosesForArbitro1 = partidosesForArbitro1;
		this.partidosesForArbitro4 = partidosesForArbitro4;
		this.partidosesForArbitro3 = partidosesForArbitro3;
		this.partidosesForArbitro5 = partidosesForArbitro5;
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
	@JoinColumn(name = "nacionalidad", nullable = false)
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Column(name = "nombre", nullable = false, length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "edad", nullable = false, length = 2)
	public String getEdad() {
		return this.edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Column(name = "posicion", nullable = false, length = 100)
	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arbitrosByArbitro2")
	public Set<Partidos> getPartidosesForArbitro2() {
		return this.partidosesForArbitro2;
	}

	public void setPartidosesForArbitro2(Set<Partidos> partidosesForArbitro2) {
		this.partidosesForArbitro2 = partidosesForArbitro2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arbitrosByArbitro1")
	public Set<Partidos> getPartidosesForArbitro1() {
		return this.partidosesForArbitro1;
	}

	public void setPartidosesForArbitro1(Set<Partidos> partidosesForArbitro1) {
		this.partidosesForArbitro1 = partidosesForArbitro1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arbitrosByArbitro4")
	public Set<Partidos> getPartidosesForArbitro4() {
		return this.partidosesForArbitro4;
	}

	public void setPartidosesForArbitro4(Set<Partidos> partidosesForArbitro4) {
		this.partidosesForArbitro4 = partidosesForArbitro4;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arbitrosByArbitro3")
	public Set<Partidos> getPartidosesForArbitro3() {
		return this.partidosesForArbitro3;
	}

	public void setPartidosesForArbitro3(Set<Partidos> partidosesForArbitro3) {
		this.partidosesForArbitro3 = partidosesForArbitro3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arbitrosByArbitro5")
	public Set<Partidos> getPartidosesForArbitro5() {
		return this.partidosesForArbitro5;
	}

	public void setPartidosesForArbitro5(Set<Partidos> partidosesForArbitro5) {
		this.partidosesForArbitro5 = partidosesForArbitro5;
	}

}
