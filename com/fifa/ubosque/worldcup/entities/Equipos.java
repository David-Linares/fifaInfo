package com.fifa.ubosque.worldcup.entities;

// Generated 11/05/2014 02:01:12 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
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
	private String sigla;
	private String nombre;
	private int idTecnico;
	private int posicionTabla;
	private int idGrupo;
	private int eliminacion;

	public Equipos() {
	}

	public Equipos(String sigla, String nombre, int idTecnico,
			int posicionTabla, int idGrupo, int eliminacion) {
		this.sigla = sigla;
		this.nombre = nombre;
		this.idTecnico = idTecnico;
		this.posicionTabla = posicionTabla;
		this.idGrupo = idGrupo;
		this.eliminacion = eliminacion;
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

	@Column(name = "id_tecnico", unique = true, nullable = false)
	public int getIdTecnico() {
		return this.idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}

	@Column(name = "posicion_tabla", nullable = false)
	public int getPosicionTabla() {
		return this.posicionTabla;
	}

	public void setPosicionTabla(int posicionTabla) {
		this.posicionTabla = posicionTabla;
	}

	@Column(name = "id_grupo", nullable = false)
	public int getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "eliminacion", nullable = false)
	public int getEliminacion() {
		return this.eliminacion;
	}

	public void setEliminacion(int eliminacion) {
		this.eliminacion = eliminacion;
	}

}
