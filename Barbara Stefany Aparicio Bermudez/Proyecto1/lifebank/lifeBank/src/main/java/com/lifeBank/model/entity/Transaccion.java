package com.lifeBank.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "transaccion")
public class Transaccion {
	@Id
	@Column(name = "id_transaccion")
	private String idTransaccion;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "monto_tra")
	private double montoTra;
	
	
	@Column(name = "id_cuenta")
	private String idCuenta;
	
	@Column(name = "id_producto")
	private String idProducto;

	public String getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMontoTra() {
		return montoTra;
	}

	public void setMontoTra(double montoTra) {
		this.montoTra = montoTra;
	}

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	
}
