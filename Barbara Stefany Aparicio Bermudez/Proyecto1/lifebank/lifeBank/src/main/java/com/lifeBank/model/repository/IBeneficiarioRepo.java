package com.lifeBank.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lifeBank.model.entity.Beneficiario;

public interface IBeneficiarioRepo extends JpaRepository<Beneficiario, Integer>{

}
