package org.citasmedicas.java.entities;

public class Medico {
    //EL MODIFICADOR DE ACCESO SE PONE
    // ANTES DEL TIPO DE DATO DEL ATRIBUTO
    //default
    /*Se recomienda para el encapsulamiento que todos los atributos de 
    una clase sean privados */
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoIdentificacion tipoIdentificacion;
    private Integer numeroIdentificacion;
    private Integer registroMedico;
    private Especialidad especialidad;
  

    public Medico(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, Integer registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
    //set para id
    //getter y setter deben ser publicos
    //setter no retornan valor : voil
    //parametro: valor a asignar al atributo
    //valor que debe ser del tipo del atributo
    public  void setId(int id){
        //asignacion del valor al atributo
        //de izquierda a derecha
        this.id = id;
    }
    
    //get retirba un vakir del tipo de dato del atributo
    public Integer getId(){
        //retorna ek valor del atributo
        return this.id;

    } 


    public Medico() {
    }
    
    @Override
    public String toString() {
        return "Medico [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", tipoIdentificacion="
                + tipoIdentificacion + ", numeroIdentificacion=" + numeroIdentificacion + ", registroMedico="
                + registroMedico + ", especialidad=" + especialidad + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
    




}
