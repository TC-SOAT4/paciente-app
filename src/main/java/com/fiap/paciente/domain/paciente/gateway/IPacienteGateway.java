package com.fiap.paciente.domain.paciente.gateway;

import com.fiap.paciente.domain.paciente.entity.Paciente;
import java.util.List;

public interface IPacienteGateway {
    List<Paciente> findAllByCpfOrEmail(String cpf, String email);
}
