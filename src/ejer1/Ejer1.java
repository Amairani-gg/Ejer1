/*
 Suponga que un individuo desea invertir su capital en un banco y desea saber
cuanto dinero ganara de un mes si el banco paga razon de 2% mensuales.
 */
package ejer1;

import java.util.Scanner;

/**
 * @AMAIRANI GRACIA GONZALEZ.
 */
public class Ejer1 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       double c,G;
        System.out.println("Ingresa la capital");
        c=leer.nextDouble();
        G=c*0.02;
        System.out.println("La gaancia es: $"+G);
        
       
    }
    
}
