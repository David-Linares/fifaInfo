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
 * Pais generated by hbm2java
 */
@Entity
@Table(name = "pais", catalog = "worldcup2014")
public class Pais implements java.io.Serializable {

	private Integer id;
	private String pais;
	private Set<Tecnicos> tecnicoses = new HashSet<Tecnicos>(0);
	private Set<Arbitros> arbitroses = new HashSet<Arbitros>(0);

	public Pais() {
	}

	public Pais(String pais) {
		this.pais = pais;
	}

	public Pais(String pais, Set<Tecnicos> tecnicoses, Set<Arbitros> arbitroses) {
		this.pais = pais;
		this.tecnicoses = tecnicoses;
		this.arbitroses = arbitroses;
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

	@Column(name = "pais", nullable = false, length = 100)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pais")
	public Set<Tecnicos> getTecnicoses() {
		return this.tecnicoses;
	}

	public void setTecnicoses(Set<Tecnicos> tecnicoses) {
		this.tecnicoses = tecnicoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pais")
	public Set<Arbitros> getArbitroses() {
		return this.arbitroses;
	}

	public void setArbitroses(Set<Arbitros> arbitroses) {
		this.arbitroses = arbitroses;
	}

}
