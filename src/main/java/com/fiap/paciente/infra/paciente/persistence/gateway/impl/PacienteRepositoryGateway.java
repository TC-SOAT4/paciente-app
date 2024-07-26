package com.fiap.paciente.infra.paciente.persistence.gateway.impl;

import com.fiap.paciente.domain.paciente.entity.Paciente;
import com.fiap.paciente.domain.paciente.gateway.IPacienteGateway;
import com.fiap.paciente.infra.mapper.PacienteMapper;
import com.fiap.paciente.infra.paciente.persistence.repository.PacienteEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PacienteRepositoryGateway implements IPacienteGateway
{
    @Autowired
    private PacienteEntityRepository pacienteRepository;
    @Autowired
    private PacienteMapper pacienteMapper;

    @Override
    public List<Paciente> findAllByCpfOrEmail(String cpf, String email)
    {
        var pacienteEntity = pacienteRepository.findAllByCpfOrEmail(cpf, email);
        return pacienteMapper.toPaciente(pacienteEntity);
    }
}
