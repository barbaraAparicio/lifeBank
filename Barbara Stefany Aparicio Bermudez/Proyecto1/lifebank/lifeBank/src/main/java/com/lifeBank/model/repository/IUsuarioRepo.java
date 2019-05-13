package com.lifeBank.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lifeBank.model.entity.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	@Query("SELECT u FROM usuario u WHERE u.nomUsuario = :nombre")
	Usuario getUsuario(@Param("nombre") String nombre);
	
}
