package com.fifa.ubosque.worldcup.entities;

// Generated 11/05/2014 02:01:12 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
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
	private int equipoLocal;
	private int equipoVisitante;
	private String fase;
	private int golesLocal;
	private int golesVisitante;
	private int autogolesLocal;
	private int autogolesVisitante;
	private int penaltiesLocal;
	private int penaltiesVisitante;
	private int sede;
	private int arbitro1;
	private Integer arbitro2;
	private Integer arbitro3;
	private Integer arbitro4;
	private Integer arbitro5;
	private Date fecha;
	private int idEstadoPartido;

	public Partidos() {
	}

	public Partidos(int equipoLocal, int equipoVisitante, String fase,
			int golesLocal, int golesVisitante, int autogolesLocal,
			int autogolesVisitante, int penaltiesLocal, int penaltiesVisitante,
			int sede, int arbitro1, Date fecha, int idEstadoPartido) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.fase = fase;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.autogolesLocal = autogolesLocal;
		this.autogolesVisitante = autogolesVisitante;
		this.penaltiesLocal = penaltiesLocal;
		this.penaltiesVisitante = penaltiesVisitante;
		this.sede = sede;
		this.arbitro1 = arbitro1;
		this.fecha = fecha;
		this.idEstadoPartido = idEstadoPartido;
	}

	public Partidos(int equipoLocal, int equipoVisitante, String fase,
			int golesLocal, int golesVisitante, int autogolesLocal,
			int autogolesVisitante, int penaltiesLocal, int penaltiesVisitante,
			int sede, int arbitro1, Integer arbitro2, Integer arbitro3,
			Integer arbitro4, Integer arbitro5, Date fecha, int idEstadoPartido) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.fase = fase;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.autogolesLocal = autogolesLocal;
		this.autogolesVisitante = autogolesVisitante;
		this.penaltiesLocal = penaltiesLocal;
		this.penaltiesVisitante = penaltiesVisitante;
		this.sede = sede;
		this.arbitro1 = arbitro1;
		this.arbitro2 = arbitro2;
		this.arbitro3 = arbitro3;
		this.arbitro4 = arbitro4;
		this.arbitro5 = arbitro5;
		this.fecha = fecha;
		this.idEstadoPartido = idEstadoPartido;
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

	@Column(name = "equipo_local", nullable = false)
	public int getEquipoLocal() {
		return this.equipoLocal;
	}

	public void setEquipoLocal(int equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	@Column(name = "equipo_visitante", nullable = false)
	public int getEquipoVisitante() {
		return this.equipoVisitante;
	}

	public void setEquipoVisitante(int equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
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

	@Column(name = "sede", nullable = false)
	public int getSede() {
		return this.sede;
	}

	public void setSede(int sede) {
		this.sede = sede;
	}

	@Column(name = "arbitro_1", nullable = false)
	public int getArbitro1() {
		return this.arbitro1;
	}

	public void setArbitro1(int arbitro1) {
		this.arbitro1 = arbitro1;
	}

	@Column(name = "arbitro_2")
	public Integer getArbitro2() {
		return this.arbitro2;
	}

	public void setArbitro2(Integer arbitro2) {
		this.arbitro2 = arbitro2;
	}

	@Column(name = "arbitro_3")
	public Integer getArbitro3() {
		return this.arbitro3;
	}

	public void setArbitro3(Integer arbitro3) {
		this.arbitro3 = arbitro3;
	}

	@Column(name = "arbitro_4")
	public Integer getArbitro4() {
		return this.arbitro4;
	}

	public void setArbitro4(Integer arbitro4) {
		this.arbitro4 = arbitro4;
	}

	@Column(name = "arbitro_5")
	public Integer getArbitro5() {
		return this.arbitro5;
	}

	public void setArbitro5(Integer arbitro5) {
		this.arbitro5 = arbitro5;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "id_estado_partido", nullable = false)
	public int getIdEstadoPartido() {
		return this.idEstadoPartido;
	}

	public void setIdEstadoPartido(int idEstadoPartido) {
		this.idEstadoPartido = idEstadoPartido;
	}

}
