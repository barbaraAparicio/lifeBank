package com.lifeBank.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario")
public class Usuario {
	
	@Column(name = "nombre_cliente")
	private String nomCliente;
	
	@Id
	@Column(name = "nombre_usuario")
	private String nomUsuario;

	@Column(name = "password")
	private String password;
	
	@Column(name = "estado")
	private int estado;
	
	@Column(name = "email")
	private String email;

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
