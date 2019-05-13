package com.lifeBank.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lifeBank.model.entity.CuentaBen;

public interface ICuentaBenRepo extends JpaRepository<CuentaBen, Integer>{

}
