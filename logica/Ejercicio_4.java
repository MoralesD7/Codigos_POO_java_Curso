package logica;

import java.util.Scanner;

/* Ejercicio 4: Una compañía de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor dado */ 
public class Ejercicio_4{
    public static void main (String args[]){

    int salario = 1000;
    int comision = 150 ; 
    double valor_venta = .05;
    int carros_vendidos;
    double total; 
    Scanner entrada = new Scanner(System.in);

    System.out.println("digita la cantidad de carros que vendiste:");
    carros_vendidos = entrada.nextInt();
    total = carros_vendidos*(salario+comision+(valor_venta*comision));
    System.out.println("la cantidad de tu salario es :"+total);

    }
}