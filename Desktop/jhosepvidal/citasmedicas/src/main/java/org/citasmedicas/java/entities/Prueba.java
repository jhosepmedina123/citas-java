package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Prueba {
    public static void main(String[] args) {
        
        //instanciar medico con constructor
        //por defecto
        Medico m = new Medico(1, "Jhosep"," Vidal", TipoIdentificacion.CEDULA_CIUDADANIA, 6666666, 777777, Especialidad.Nutricionista);
        //asignar el id al medico: utilizar el setId
        m.setId(666);
        //imprimir el id del medico: utilizo el getId
      System.out.println(m.getId());

      //Crear un paciente
        Paciente p1 = new Paciente(1,
                                    "alejandro",
                                    "medina",
                                    TipoIdentificacion.TARJETA_IDENTIDAD,
                                    3654654,
                                    "GATITA@GMAIL.com",
                                    987987,
                                    LocalDate.of(2002, Month.APRIL, 01),
                                    1.10,
                                    80.9, 
                                    TipoSangre.A, 
                                    '-');

    //utilizar los getter y setter de lombok
    System.out.println("Nombre:" + p1.getNombres()
                       + ", Apellido:" + p1.getApellidos());
    Consultorio con1 = new Consultorio(1, "diagona 51", 8768);
    Cita cita1 = new Cita(1, LocalDateTime.of(2025, 01, 1, 12, 12, 0) , p1, m, con1);
    System.out.println(cita1);

    }
}
