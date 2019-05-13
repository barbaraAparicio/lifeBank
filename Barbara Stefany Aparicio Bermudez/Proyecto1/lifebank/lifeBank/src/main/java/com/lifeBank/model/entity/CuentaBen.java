package com.lifeBank.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "cuentaben")
public class CuentaBen {	
	@Id
	@Column(name = "id_cuentaben")
	private String idCuentaBen;
	
	
	@Column(name = "id_beneficiario")
	private String idBeneficiario;

	public String getIdCuentaBen() {
		return idCuentaBen;
	}

	public void setIdCuentaBen(String idCuentaBen) {
		this.idCuentaBen = idCuentaBen;
	}

	public String getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(String idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}
	
}
