package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de enteros a comparar:");
        int cantidad = entrada.nextInt();

        // Si el usuario ingresa un número negativo o cero, salimos del programa
        if (cantidad <= 0) {
            System.out.println("El número de enteros a comparar debe ser positivo y mayor que cero.");
            return;
        }

        int menor = Integer.MAX_VALUE;

        // Iteramos sobre los enteros ingresados por el usuario
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el entero #" + (i + 1) + ":");
            int num = entrada.nextInt();

            // Comparamos para encontrar el menor
            if (num < menor) {
                menor = num;
            }
        }

        // Imprimimos el resultado
        System.out.println("El menor de los enteros ingresados es: " + menor);

        entrada.close();
    }
}
