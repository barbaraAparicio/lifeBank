package com.lifeBank.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lifeBank.model.entity.Transaccion;

public interface ITransaccionRepo extends JpaRepository<Transaccion, Integer>{

}
