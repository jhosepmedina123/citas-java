package org.citasmedicas.java.entities;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor

public class Cita {
    private Integer id;
    private LocalDateTime fecha;
    private Paciente paciente;
    private Medico medico;
    private Consultorio consultorio;
}
