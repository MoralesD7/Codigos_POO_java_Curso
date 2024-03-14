//Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

package logica ;

import java.util.Scanner;

public class Ejercicio_3{

    public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);
    int Guillermo,Luis,Juan,total;
    System.out.println("digita la cantidad de dinero que tiene Guillermo:");

    Guillermo = entrada.nextInt();
    Luis = Guillermo/2;
    Juan = (Luis+Guillermo)/2;
    total = Luis + Juan + Guillermo;

    System.out.println("la cantidad de dinero que tienen entre los 3 es :" +total);
    
    }
}