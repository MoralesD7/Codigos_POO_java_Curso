/*programa que calcule el salario semanal de un empleado apartir de sus horas semanales
y de su salario por hora */
package logica;

import java.util.Scanner;

public class Ejercicio_2{
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int horas_trabajadas,cobro,salario;

        System.out.println("digita la cantidad de horas que trabajo :");
        horas_trabajadas = entrada.nextInt();

        System.out.println("digita cuanto cobra por hora :");
        cobro = entrada.nextInt();
        salario = horas_trabajadas*cobro;

        System.out.println("El salario del empleado es :"+salario);
    }
}
