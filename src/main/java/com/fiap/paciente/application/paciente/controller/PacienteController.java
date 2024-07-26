package com.fiap.paciente.application.paciente.controller;

import com.fiap.paciente.domain.paciente.usecase.IBuscarPacientes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pacientes")
@Tag(name = "Pacientes")
public class PacienteController {
    @Autowired
    private IBuscarPacientes buscarPacienteService;

    //@PreAuthorize("hasRole('PACIENTE')")
    @GetMapping()
    @Operation(
            summary = "Busca por paciente",
            description = "Listar pacientes filtrando pelos parâmetros informados. <br>É necessário informar no mínimo um filtro para busca.",
            parameters = {
                    @Parameter(in = ParameterIn.QUERY, name = "cpf",
                            description = "CPF do paciente que deseja buscar.",
                            style = ParameterStyle.SIMPLE, example = "12312312326"),
                    @Parameter(in = ParameterIn.QUERY, name = "email",
                            description = "Email do paciente que deseja buscar.",
                            style = ParameterStyle.SIMPLE, example = "snow.jon@email.com.br")
            })
    public ResponseEntity<?> consultaPaciente(
            @RequestParam (required = false) String cpf,
            @RequestParam (required = false) String email
    )
    {
        try {
            var response = buscarPacienteService.consultaPaciente(cpf, email);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
