package org.cgmlti.adso.ciclos;

public class EjercicioCiclos {
public static void main(String[] args) {
    int contador;
    //Varibale contadora
    //Nombre signifactivo
    //Recomendacion : Valor inicial = 0
    int total = 0;

    for(contador = 0;
    contador<= 10;
    contador++){
            //Instruccion de acumulacion
            // no se utiliza la variable de control
            total+= contador;
            System.out.println(contador);
        

    }
        //imprimir variable acumuladora 
        //siempre despues del ciclo
        System.out.println("El total es:" + total);

        while (contador<=1)
        System.out.println(contador);

        contador+=10;
        total+= contador;{
            System.out.println("el totral de la suma es:" + total);
        }
        
}
}
