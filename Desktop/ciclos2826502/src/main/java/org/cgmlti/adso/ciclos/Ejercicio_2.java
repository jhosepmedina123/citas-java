
package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nota = "";
        String flag = "y";
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorD = 0;

        do{
            System.out.println("ingresar nota");
            nota = in.next();
            switch (nota) {
                case "A": contadorA+=1;    
                        break;
                case "B": contadorB++;
                        break; 
                case "C": contadorC++;    
                        break;
                case "D": contadorD++;
                default:System.out.println("nota no valida");
                    break;
                    
            }
            //if(nota.equals("a")){
            //    contadorA+=1;
            //}else if (nota.equals("b")){
            //    ++contadorB;
            //}else if (nota.equals("c")){
            //    contadorC+=1;
            //}else if (nota.equals("d")){
            //    ++contadorD;

            System.out.println("desea continuar? y/n " );
            flag = in.next();
        } while(flag.equals("y"));

        System.out.println("Total A: "+ contadorA);
        System.out.println("Total B: "+ contadorB);
        System.out.println("Total C: "+ contadorC);
        System.out.println("Total D: "+ contadorD);

        in.close();
    }
}