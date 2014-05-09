package com.fifa.ubosque.worldcup.entities;

// Generated 6/05/2014 08:40:07 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Partidos generated by hbm2java
 */
@Entity
@Table(name = "partidos", catalog = "worldcup2014")
public class Partidos implements java.io.Serializable {

	private Integer id;
	private EstadosPartidos estadosPartidos;
	private Arbitros arbitrosByArbitro5;
	private Arbitros arbitrosByArbitro1;
	private Arbitros arbitrosByArbitro2;
	private Equipos equiposByEquipoVisitante;
	private Arbitros arbitrosByArbitro3;
	private Arbitros arbitrosByArbitro4;
	private Estadios estadios;
	private Equipos equiposByEquipoLocal;
	private String fase;
	private int golesLocal;
	private int golesVisitante;
	private int autogolesLocal;
	private int autogolesVisitante;
	private int penaltiesLocal;
	private int penaltiesVisitante;
	private Date fecha;
	private Set<Descripcion> descripcions = new HashSet<Descripcion>(0);

	public Partidos() {
	}

	public Partidos(EstadosPartidos estadosPartidos,
			Arbitros arbitrosByArbitro1, Equipos equiposByEquipoVisitante,
			Estadios estadios, Equipos equiposByEquipoLocal, String fase,
			int golesLocal, int golesVisitante, int autogolesLocal,
			int autogolesVisitante, int penaltiesLocal, int penaltiesVisitante,
			Date fecha) {
		this.estadosPartidos = estadosPartidos;
		this.arbitrosByArbitro1 = arbitrosByArbitro1;
		this.equiposByEquipoVisitante = equiposByEquipoVisitante;
		this.estadios = estadios;
		this.equiposByEquipoLocal = equiposByEquipoLocal;
		this.fase = fase;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.autogolesLocal = autogolesLocal;
		this.autogolesVisitante = autogolesVisitante;
		this.penaltiesLocal = penaltiesLocal;
		this.penaltiesVisitante = penaltiesVisitante;
		this.fecha = fecha;
	}

	public Partidos(EstadosPartidos estadosPartidos,
			Arbitros arbitrosByArbitro5, Arbitros arbitrosByArbitro1,
			Arbitros arbitrosByArbitro2, Equipos equiposByEquipoVisitante,
			Arbitros arbitrosByArbitro3, Arbitros arbitrosByArbitro4,
			Estadios estadios, Equipos equiposByEquipoLocal, String fase,
			int golesLocal, int golesVisitante, int autogolesLocal,
			int autogolesVisitante, int penaltiesLocal, int penaltiesVisitante,
			Date fecha, Set<Descripcion> descripcions) {
		this.estadosPartidos = estadosPartidos;
		this.arbitrosByArbitro5 = arbitrosByArbitro5;
		this.arbitrosByArbitro1 = arbitrosByArbitro1;
		this.arbitrosByArbitro2 = arbitrosByArbitro2;
		this.equiposByEquipoVisitante = equiposByEquipoVisitante;
		this.arbitrosByArbitro3 = arbitrosByArbitro3;
		this.arbitrosByArbitro4 = arbitrosByArbitro4;
		this.estadios = estadios;
		this.equiposByEquipoLocal = equiposByEquipoLocal;
		this.fase = fase;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.autogolesLocal = autogolesLocal;
		this.autogolesVisitante = autogolesVisitante;
		this.penaltiesLocal = penaltiesLocal;
		this.penaltiesVisitante = penaltiesVisitante;
		this.fecha = fecha;
		this.descripcions = descripcions;
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
	@JoinColumn(name = "id_estado_partido", nullable = false)
	public EstadosPartidos getEstadosPartidos() {
		return this.estadosPartidos;
	}

	public void setEstadosPartidos(EstadosPartidos estadosPartidos) {
		this.estadosPartidos = estadosPartidos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "arbitro_5")
	public Arbitros getArbitrosByArbitro5() {
		return this.arbitrosByArbitro5;
	}

	public void setArbitrosByArbitro5(Arbitros arbitrosByArbitro5) {
		this.arbitrosByArbitro5 = arbitrosByArbitro5;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "arbitro_1", nullable = false)
	public Arbitros getArbitrosByArbitro1() {
		return this.arbitrosByArbitro1;
	}

	public void setArbitrosByArbitro1(Arbitros arbitrosByArbitro1) {
		this.arbitrosByArbitro1 = arbitrosByArbitro1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "arbitro_2")
	public Arbitros getArbitrosByArbitro2() {
		return this.arbitrosByArbitro2;
	}

	public void setArbitrosByArbitro2(Arbitros arbitrosByArbitro2) {
		this.arbitrosByArbitro2 = arbitrosByArbitro2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "equipo_visitante", nullable = false)
	public Equipos getEquiposByEquipoVisitante() {
		return this.equiposByEquipoVisitante;
	}

	public void setEquiposByEquipoVisitante(Equipos equiposByEquipoVisitante) {
		this.equiposByEquipoVisitante = equiposByEquipoVisitante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "arbitro_3")
	public Arbitros getArbitrosByArbitro3() {
		return this.arbitrosByArbitro3;
	}

	public void setArbitrosByArbitro3(Arbitros arbitrosByArbitro3) {
		this.arbitrosByArbitro3 = arbitrosByArbitro3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "arbitro_4")
	public Arbitros getArbitrosByArbitro4() {
		return this.arbitrosByArbitro4;
	}

	public void setArbitrosByArbitro4(Arbitros arbitrosByArbitro4) {
		this.arbitrosByArbitro4 = arbitrosByArbitro4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sede", nullable = false)
	public Estadios getEstadios() {
		return this.estadios;
	}

	public void setEstadios(Estadios estadios) {
		this.estadios = estadios;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "equipo_local", nullable = false)
	public Equipos getEquiposByEquipoLocal() {
		return this.equiposByEquipoLocal;
	}

	public void setEquiposByEquipoLocal(Equipos equiposByEquipoLocal) {
		this.equiposByEquipoLocal = equiposByEquipoLocal;
	}

	@Column(name = "fase", nullable = false, length = 100)
	public String getFase() {
		return this.fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	@Column(name = "goles_local", nullable = false)
	public int getGolesLocal() {
		return this.golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	@Column(name = "goles_visitante", nullable = false)
	public int getGolesVisitante() {
		return this.golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	@Column(name = "autogoles_local", nullable = false)
	public int getAutogolesLocal() {
		return this.autogolesLocal;
	}

	public void setAutogolesLocal(int autogolesLocal) {
		this.autogolesLocal = autogolesLocal;
	}

	@Column(name = "autogoles_visitante", nullable = false)
	public int getAutogolesVisitante() {
		return this.autogolesVisitante;
	}

	public void setAutogolesVisitante(int autogolesVisitante) {
		this.autogolesVisitante = autogolesVisitante;
	}

	@Column(name = "penalties_local", nullable = false)
	public int getPenaltiesLocal() {
		return this.penaltiesLocal;
	}

	public void setPenaltiesLocal(int penaltiesLocal) {
		this.penaltiesLocal = penaltiesLocal;
	}

	@Column(name = "penalties_visitante", nullable = false)
	public int getPenaltiesVisitante() {
		return this.penaltiesVisitante;
	}

	public void setPenaltiesVisitante(int penaltiesVisitante) {
		this.penaltiesVisitante = penaltiesVisitante;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "partidos")
	public Set<Descripcion> getDescripcions() {
		return this.descripcions;
	}

	public void setDescripcions(Set<Descripcion> descripcions) {
		this.descripcions = descripcions;
	}

}
