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
import javax.persistence.UniqueConstraint;

/**
 * Equipos generated by hbm2java
 */
@Entity
@Table(name = "equipos", catalog = "worldcup2014", uniqueConstraints = {
		@UniqueConstraint(columnNames = "sigla"),
		@UniqueConstraint(columnNames = "id_tecnico") })
public class Equipos implements java.io.Serializable {

	private Integer id;
	private Grupos grupos;
	private Tecnicos tecnicos;
	private String sigla;
	private String nombre;
	private int posicionTabla;
	private int eliminacion;
	private Set<Partidos> partidosesForEquipoLocal = new HashSet<Partidos>(0);
	private Set<Partidos> partidosesForEquipoVisitante = new HashSet<Partidos>(
			0);
	private Set<Jugadores> jugadoreses = new HashSet<Jugadores>(0);
	private Set<RankingEquipos> rankingEquiposes = new HashSet<RankingEquipos>(
			0);

	public Equipos() {
	}

	public Equipos(Grupos grupos, Tecnicos tecnicos, String sigla,
			String nombre, int posicionTabla, int eliminacion) {
		this.grupos = grupos;
		this.tecnicos = tecnicos;
		this.sigla = sigla;
		this.nombre = nombre;
		this.posicionTabla = posicionTabla;
		this.eliminacion = eliminacion;
	}

	public Equipos(Grupos grupos, Tecnicos tecnicos, String sigla,
			String nombre, int posicionTabla, int eliminacion,
			Set<Partidos> partidosesForEquipoLocal,
			Set<Partidos> partidosesForEquipoVisitante,
			Set<Jugadores> jugadoreses, Set<RankingEquipos> rankingEquiposes) {
		this.grupos = grupos;
		this.tecnicos = tecnicos;
		this.sigla = sigla;
		this.nombre = nombre;
		this.posicionTabla = posicionTabla;
		this.eliminacion = eliminacion;
		this.partidosesForEquipoLocal = partidosesForEquipoLocal;
		this.partidosesForEquipoVisitante = partidosesForEquipoVisitante;
		this.jugadoreses = jugadoreses;
		this.rankingEquiposes = rankingEquiposes;
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
	@JoinColumn(name = "id_grupo", nullable = false)
	public Grupos getGrupos() {
		return this.grupos;
	}

	public void setGrupos(Grupos grupos) {
		this.grupos = grupos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tecnico", unique = true, nullable = false)
	public Tecnicos getTecnicos() {
		return this.tecnicos;
	}

	public void setTecnicos(Tecnicos tecnicos) {
		this.tecnicos = tecnicos;
	}

	@Column(name = "sigla", unique = true, nullable = false, length = 3)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "nombre", nullable = false, length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "posicion_tabla", nullable = false)
	public int getPosicionTabla() {
		return this.posicionTabla;
	}

	public void setPosicionTabla(int posicionTabla) {
		this.posicionTabla = posicionTabla;
	}

	@Column(name = "eliminacion", nullable = false)
	public int getEliminacion() {
		return this.eliminacion;
	}

	public void setEliminacion(int eliminacion) {
		this.eliminacion = eliminacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equiposByEquipoLocal")
	public Set<Partidos> getPartidosesForEquipoLocal() {
		return this.partidosesForEquipoLocal;
	}

	public void setPartidosesForEquipoLocal(
			Set<Partidos> partidosesForEquipoLocal) {
		this.partidosesForEquipoLocal = partidosesForEquipoLocal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equiposByEquipoVisitante")
	public Set<Partidos> getPartidosesForEquipoVisitante() {
		return this.partidosesForEquipoVisitante;
	}

	public void setPartidosesForEquipoVisitante(
			Set<Partidos> partidosesForEquipoVisitante) {
		this.partidosesForEquipoVisitante = partidosesForEquipoVisitante;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipos")
	public Set<Jugadores> getJugadoreses() {
		return this.jugadoreses;
	}

	public void setJugadoreses(Set<Jugadores> jugadoreses) {
		this.jugadoreses = jugadoreses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipos")
	public Set<RankingEquipos> getRankingEquiposes() {
		return this.rankingEquiposes;
	}

	public void setRankingEquiposes(Set<RankingEquipos> rankingEquiposes) {
		this.rankingEquiposes = rankingEquiposes;
	}

}
