package com.fifa.ubosque.worldcup.entities;

// Generated 6/05/2014 08:40:07 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Perfiles generated by hbm2java
 */
@Entity
@Table(name = "perfiles", catalog = "worldcup2014")
public class Perfiles implements java.io.Serializable {

	private Integer id;
	private String nombrePerfil;
	private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

	public Perfiles() {
	}

	public Perfiles(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	public Perfiles(String nombrePerfil, Set<Usuarios> usuarioses) {
		this.nombrePerfil = nombrePerfil;
		this.usuarioses = usuarioses;
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

	@Column(name = "nombre_perfil", nullable = false, length = 100)
	public String getNombrePerfil() {
		return this.nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perfiles")
	public Set<Usuarios> getUsuarioses() {
		return this.usuarioses;
	}

	public void setUsuarioses(Set<Usuarios> usuarioses) {
		this.usuarioses = usuarioses;
	}

}
