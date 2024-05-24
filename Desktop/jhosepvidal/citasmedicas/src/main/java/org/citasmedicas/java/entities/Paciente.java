package org.citasmedicas.java.entities;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
@AllArgsConstructor
@Getter
@Setter

public class Paciente {

    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoIdentificacion tipoIdentificacion;
    private Integer numeroIdentificacion; 
    private String correoElectronico;
    private Integer celular;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private Character factorRH;

}





























































































