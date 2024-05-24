package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class PasswordDoWhile {
    public static void main(String[] args) {
        String password = "";
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese la contraseña sapoperro:");
            password = in.next();
        }while(!password.equals("Sapo"));
        
    }

}
