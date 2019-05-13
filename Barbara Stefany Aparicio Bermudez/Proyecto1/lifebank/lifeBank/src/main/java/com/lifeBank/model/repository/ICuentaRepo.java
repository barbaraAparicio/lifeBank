package com.lifeBank.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lifeBank.model.entity.Cuenta;

public interface ICuentaRepo extends JpaRepository<Cuenta, Integer>{

}
