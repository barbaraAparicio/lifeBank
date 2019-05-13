package com.lifeBank.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productoben")
public class ProductoBen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_productoben")
	private int idProductoBen;
	
	@Column(name = "nombre_producto")
	private String nomProducto;
	
	@Column(name = "monto")
	private double monto;
	
	@Column(name = "debt")
	private double debt;
	
	@Column(name = "disponible")
	private double disponible;
	
	@Column(name = "limite")
	private double limite;
	
	@Column(name = "interes_acum")
	private double interesAcum;
	
	@Column(name = "interes_tasa")
	private float interesTasa;
	
	@Column(name = "dia_corte")
	private int diaCorte;
	
	@Column(name = "id_cuentaben")
	private String idCuentaBen;

	public int getIdProductoBen() {
		return idProductoBen;
	}

	public void setIdProductoBen(int idProductoBen) {
		this.idProductoBen = idProductoBen;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getDisponible() {
		return disponible;
	}

	public void setDisponible(double disponible) {
		this.disponible = disponible;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getInteresAcum() {
		return interesAcum;
	}

	public void setInteresAcum(double interesAcum) {
		this.interesAcum = interesAcum;
	}

	public float getInteresTasa() {
		return interesTasa;
	}

	public void setInteresTasa(float interesTasa) {
		this.interesTasa = interesTasa;
	}

	public int getDiaCorte() {
		return diaCorte;
	}

	public void setDiaCorte(int diaCorte) {
		this.diaCorte = diaCorte;
	}

	public String getIdCuentaBen() {
		return idCuentaBen;
	}

	public void setIdCuentaBen(String idCuentaBen) {
		this.idCuentaBen = idCuentaBen;
	}
	
}
