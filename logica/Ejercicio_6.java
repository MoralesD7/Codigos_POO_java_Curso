package logica;
//binomio cuadrado 

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);
        int a,b,resultado; 

        System.out.println("digita los dos numeros para el binomio cuadrado ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        resultado = ((a*a)+(b*b)+(2*a*b));
        System.out.println("el resultado de tus numeros dentro del binomio es :"+ resultado);

    }
}
