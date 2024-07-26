package com.fiap.paciente.infra.paciente.persistence.repository;

import com.fiap.paciente.infra.paciente.persistence.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface PacienteEntityRepository extends JpaRepository<PacienteEntity, UUID> {
    List<PacienteEntity> findAllByCpfOrEmail(String cpf, String email);
}
