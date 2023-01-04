package com.fluig.repository;

import com.fluig.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroVeiculoRepository extends JpaRepository<VeiculoEntity, Long> {
}
