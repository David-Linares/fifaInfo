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
 * Tecnicos generated by hbm2java
 */
@Entity
@Table(name = "tecnicos", catalog = "worldcup2014")
public class Tecnicos implements java.io.Serializable {

	private Integer id;
	private Pais pais;
	private String nombre;
	private String edad;
	private Set<Equipos> equiposes = new HashSet<Equipos>(0);

	public Tecnicos() {
	}

	public Tecnicos(Pais pais, String nombre, String edad) {
		this.pais = pais;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Tecnicos(Pais pais, String nombre, String edad,
			Set<Equipos> equiposes) {
		this.pais = pais;
		this.nombre = nombre;
		this.edad = edad;
		this.equiposes = equiposes;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tecnicos")
	public Set<Equipos> getEquiposes() {
		return this.equiposes;
	}

	public void setEquiposes(Set<Equipos> equiposes) {
		this.equiposes = equiposes;
	}

}
