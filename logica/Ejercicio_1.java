//suma de 3 calificaciones 

package logica;
//Declaracion del paquete al que pertenece 
//moficador de acceso_ clase _ Nombre de la clase 

import java.util.Scanner;

public class Ejercicio_1{
    //El metodo principal de la clase 
    /*el tipo de retorno void se utiliza cuando un método no devuelve ningún valor. Esto es consistente con el hecho de que el método main generalmente no devuelve un valor, ya que se utiliza para iniciar la ejecución del programa y no se espera que devuelva un resultado */
    public static void main (String args[]){
        //intancia del objeto para la entrada de datos 
    Scanner entrada = new Scanner(System.in);
    //declaracion de las variables que alojaran los datos y el resultado 
    int numero_1,numero_2,numero_3,resultado;
    
    System.out.println("digita los 3 numeros :");
        numero_1 = entrada.nextInt();
        numero_2 = entrada.nextInt();
        numero_3 = entrada.nextInt();
    resultado = numero_1+numero_2+numero_3;
    System.out.println("El resultado es :"+ resultado);


    }
}