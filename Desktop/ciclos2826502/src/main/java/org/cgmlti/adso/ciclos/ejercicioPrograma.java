package org.cgmlti.adso.ciclos;

import java.util.ArrayList;


public class ejercicioPrograma {
    public static void main(String[] args) {
        int promedio = 0;

        ArrayList<Integer> nota = new ArrayList<Integer>();   
        nota.add(1);
        nota.add(2);
        nota.add(3);
        nota.add(4);
        nota.add(5);
        nota.add(6);
        nota.add(7);
        nota.add(8);
        nota.add(9);
        nota.add(10);


        for(int notas : nota){
            promedio += notas;
        }
        System.out.println(promedio/10);


        
    }

}
