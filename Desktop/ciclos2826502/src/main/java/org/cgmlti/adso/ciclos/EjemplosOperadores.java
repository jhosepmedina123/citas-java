package org.cgmlti.adso.ciclos;

public class EjemplosOperadores {
    
    public static void main(String[] args) {
        
        int a=2, b=3, c=5;
        boolean y = c * b++ <10 && b < 6;
        System.out.println(y);
        System.out.println(b);

        int y2 = (c-3) /a*(--b +--b) / a + c;
        System.out.println(y2);



    }
}