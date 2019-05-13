package com.lifeBank.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "cuenta")
public class Cuenta {
	@Id
	@Column(name = "id_cuenta")
	private String idCuenta;
	
	
	@Column(name = "nombre_usuario")
	private String nomUsuario;

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	
}
