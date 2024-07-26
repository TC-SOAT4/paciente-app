package com.fiap.paciente.infra.mapper;

import com.fiap.paciente.domain.paciente.entity.Paciente;
import com.fiap.paciente.infra.paciente.persistence.entity.PacienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PacienteMapper {
    List<Paciente> toPaciente(List<PacienteEntity> pacienteEntity);
}
