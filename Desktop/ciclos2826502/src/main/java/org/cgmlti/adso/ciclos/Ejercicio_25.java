package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el nombre del mes
        System.out.println("Ingrese el nombre del mes:");
        String mes = in.nextLine(); // Convertimos a minúsculas para hacer la comparación más flexible

        int dias;

        // Utilizamos un switch para determinar el número de días según el nombre del mes
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                dias = 28;
                break;
            default:
                System.out.println("Mes ingresado inválido.");
                in.close();
                return;
                
        }

        // Imprimimos el resultado
        System.out.println("El mes de " + mes + " tiene " + dias + " días.");

        in.close();
    }
}
