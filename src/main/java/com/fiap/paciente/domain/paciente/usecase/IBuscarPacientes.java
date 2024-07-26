package com.fiap.paciente.domain.paciente.usecase;

import com.fiap.paciente.domain.paciente.entity.Paciente;
import java.util.List;

public interface IBuscarPacientes {
    List<Paciente> consultaPaciente(String cpf, String email);
}
