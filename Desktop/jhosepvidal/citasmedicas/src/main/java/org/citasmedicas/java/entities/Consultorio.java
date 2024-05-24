package org.citasmedicas.java.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Consultorio {
    private Integer id;
    private String direccion;
    private Integer numero;

}