package org.cgmlti.adso.ciclos;

public class CicloBasico {

    public static void main(String[] args) {
        /*contador es de tipo entero */
        int contador = 0;
        
        /*Tip: el valor de la condicional 
                deberia ser el valor final
                ciclo */
        while(contador >= 1 ) {
            /*instrucciuon de codigo */
            System.out.println(contador);

            /*instruccionde incremento
            se asigna a la variable de control 
            el mismo valor de la variable de control
            Mas rl valor de incremento 
            instrcciones de incremento
            se ubica al final del
            bloque de codigo */
            /*se puede utilizar "contador += , contador++ , ++contador o contador = contador + 1" parea aumentar el contador */
            /*se puede utilizar "los mismo con el signo -" para decrementar las cifras */

            --contador;

        }
    

    }

}
