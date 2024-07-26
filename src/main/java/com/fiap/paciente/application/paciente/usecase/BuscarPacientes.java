package com.fiap.paciente.application.paciente.usecase;

import com.fiap.paciente.domain.paciente.entity.Paciente;
import com.fiap.paciente.domain.paciente.gateway.IPacienteGateway;
import com.fiap.paciente.domain.paciente.usecase.IBuscarPacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BuscarPacientes implements IBuscarPacientes {

    @Autowired
    private IPacienteGateway pacienteGateway;

    public List<Paciente> consultaPaciente(String cpf, String email)
    {
        //Valida parâmetros de entrada
        if((cpf == null || cpf.isEmpty())
                && (email  == null || email.isEmpty())
        )
        {
            throw new RuntimeException("É necessário informar ao menos um parâmetro para consulta.");
        }
        return pacienteGateway.findAllByCpfOrEmail(cpf, email);
    }
}
