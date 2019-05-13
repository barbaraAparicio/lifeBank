package com.lifeBank.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lifeBank.model.entity.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
