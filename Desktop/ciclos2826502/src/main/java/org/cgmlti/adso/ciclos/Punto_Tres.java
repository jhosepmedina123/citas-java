package org.cgmlti.adso.ciclos;

public class Punto_Tres {
    public static void main(String[] args) {
        
        // Suma de enteros impares entre 1 y 99
        int suma = 0;
        for (int i = 1; i <= 99; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los enteros impares entre 1 y 99 es: " + suma);
    }

}
