package com.proyectos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InformacionDataFtp")
public class InformacionDataFtp {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTransaccion;
	private int anio;
	private int mes;
	private int quincena;
	private int idRamo;
	private int idUri;
	private int idTipoArchivo;
	private String nombre;
	private int estado;
	
	public InformacionDataFtp() {
		// TODO Auto-generated constructor stub
	}

	public long getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(long idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getQuincena() {
		return quincena;
	}

	public void setQuincena(int quincena) {
		this.quincena = quincena;
	}

	public int getIdRamo() {
		return idRamo;
	}

	public void setIdRamo(int idRamo) {
		this.idRamo = idRamo;
	}

	public int getIdUri() {
		return idUri;
	}

	public void setIdUri(int idUri) {
		this.idUri = idUri;
	}

	public int getIdTipoArchivo() {
		return idTipoArchivo;
	}

	public void setIdTipoArchivo(int idTipoArchivo) {
		this.idTipoArchivo = idTipoArchivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "InformacionDataFtp [idTransaccion=" + idTransaccion + ", anio=" + anio + ", mes=" + mes + ", quincena="
				+ quincena + ", idRamo=" + idRamo + ", idUri=" + idUri + ", idTipoArchivo=" + idTipoArchivo
				+ ", nombre=" + nombre + ", estado=" + estado + "]";
	}

}
