package com.lifeBank.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "beneficiario")
public class Beneficiario {
	@Id
	@Column(name = "dui_beneficiario")
	private String idBeneficiario;
	
	@Column(name = "nombre_beneficiario")
	private String nomBeneficiario;
	
	@Column(name = "id_cuenta")
	private String idCuenta;

	public String getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(String idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public String getNomBeneficiario() {
		return nomBeneficiario;
	}

	public void setNomBeneficiario(String nomBeneficiario) {
		this.nomBeneficiario = nomBeneficiario;
	}

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}
	
	
}
