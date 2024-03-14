package logica;

import java.util.Scanner;

/*Ejercicio 5: La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.     Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante. */
public class Ejercicio_5 {
    
    public static void main (String args[]){
        double  total;
        double participaciónes,primer_examen,segundo_examen,examen_final;
        double  pon_1=1;
        double  pon_2 =2.5;
        double  pon_3 =4;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digita las calificaciones del problema respecticamente escala de 1-10:");
        participaciónes = entrada.nextDouble();
        primer_examen = entrada.nextDouble();
        segundo_examen = entrada.nextDouble();
        examen_final = entrada.nextDouble();
        total = ((participaciónes*pon_1)+(primer_examen*pon_2)+(segundo_examen*pon_2)+(examen_final*pon_3));
        System.out.println("la calificacion del alumno es :"+ total);
        

    }
}
