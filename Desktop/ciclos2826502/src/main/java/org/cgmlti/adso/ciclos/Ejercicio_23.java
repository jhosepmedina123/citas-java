package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {
        System.out.println("Ingrese la talla:");
        
        Scanner in = new Scanner(System.in);
        String tamaño = in.next();

        System.out.println("La talla del calzado en US es:");

        // Utilizamos un switch para determinar el tamaño según la talla de calzado en US
        switch (tamaño) {
            case "6" , "6.5", "7" , "7.5", "8", "8.5":
                System.err.println("pequeña");
                break;
            case "9", "9.5","10","10.5", "11", "11.5":
                System.out.println("mediana");;
                break;
            case "12","12.5", "13", "13.5", "14":
                System.out.println("grande");;
                break;
        }
    }
}