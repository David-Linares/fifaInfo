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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EstadosPartidos generated by hbm2java
 */
@Entity
@Table(name = "estados_partidos", catalog = "worldcup2014")
public class EstadosPartidos implements java.io.Serializable {

	private Integer id;
	private String estadoPartido;
	private Set<Partidos> partidoses = new HashSet<Partidos>(0);

	public EstadosPartidos() {
	}

	public EstadosPartidos(String estadoPartido, Set<Partidos> partidoses) {
		this.estadoPartido = estadoPartido;
		this.partidoses = partidoses;
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

	@Column(name = "estado_partido", length = 100)
	public String getEstadoPartido() {
		return this.estadoPartido;
	}

	public void setEstadoPartido(String estadoPartido) {
		this.estadoPartido = estadoPartido;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadosPartidos")
	public Set<Partidos> getPartidoses() {
		return this.partidoses;
	}

	public void setPartidoses(Set<Partidos> partidoses) {
		this.partidoses = partidoses;
	}

}
