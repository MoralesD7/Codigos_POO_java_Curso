/*Ejercicio 7: Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas  equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
package logica;

import java.util.Scanner;

public class Ejercicio_7{
    public static void main (String args[]){
    
    Scanner entrada = new Scanner(System.in);
    int horas,dias,semanas;
    System.out.println("digita la cantidad de horas a convertir:");
    horas = entrada.nextInt();
    semanas = horas / 168; // 1 semana = 168 horas
    dias = (horas % 168) / 24; // 1 día = 24 horas
    horas = horas % 24;
    System.out.println("El tiempo en semanas ,dias y horas es :"+semanas+","+dias+","+horas+",");
    
    }
}