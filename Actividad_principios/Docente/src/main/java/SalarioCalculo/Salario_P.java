package SalarioCalculo;

import java.util.Scanner;
/*
    @author Camilo Andres Garcia Zambrano
    Clase que posee el main o ejecucion del proyecto
    @version 20/11/2021
*/
public class Salario_P {
    public static void main(String[] arg){
        System.out.println("Bienvenido al programa que calcula salario de docente.\n");
        Scanner entrada = new Scanner(System.in);
        //se crean variables
        boolean comprobar = true;
        String desicion = "";
        do {
            //se crea objeto para pedir, almacenar y mostrar datos
            Pedir_datos ped = new Pedir_datos();
            ped.entrar_datos();
            ped.mostrar_datos();
            System.out.println("\nEl salario total es: "+ped.getSalario_t());           
            //condicional para preguntar y verificar buclo do while
            do {
                System.out.println("Desea hacer otro calculo? (y/n): ");
                desicion = entrada.next();
                System.out.println("");
            }while(!desicion.equals("Y") && !desicion.equals("y") && !desicion.equals("n") && !desicion.equals("N"));

            //condicional para finalizar el bucle
            if(desicion.equals("n") || desicion.equals("N")) {
                    comprobar = false;
            }
        }while(comprobar);
        System.out.println("\nGracias por implementar nuestro software");
    }
}