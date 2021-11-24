package SalarioCalculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salario_P {
	public static void main(String[] arg) throws IOException{
		System.out.println("Bienvenido al programa que calcula salario de docente.\n");
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		//se crean variables
		int cantidad_docentes;
		Double salario_t;
		int opcion;
		boolean comprobar = true;
		String desicion = "";
		do {
			//se refresca valor de salario_t
			salario_t=0.0;
			System.out.println("");
			//se piden cantidad de docentes
			System.out.println("Digite cantidad de docentes a registrar: ");
			cantidad_docentes = Integer.parseInt(in.readLine());
			Docente[] docentes = new Docente[cantidad_docentes];
			//bucle para registrar docentes
			for(int i=0;i<cantidad_docentes;i++) {
                            //Se indica en que docente va
                            System.out.println("Docente "+(i+1));
                            //bucle para validar tipo de dato
                            do {
                                    //se pregunta nivel de estudio
                                    System.out.println("\nNivel de estudio: 1)Doctorado\t2)Maestria\t3)Espesialisaci�n\t4)Sin postgrado");
                                    System.out.println("Opcion: ");
                                    opcion = Integer.parseInt(in.readLine());
                                    if(opcion>4||opcion<1) {
                                            System.out.println("Opcion invalida.");
                                    }
                            }while(opcion>4||opcion<1);
                            //se calcula segun opcion, se crea tipo de docente en especifico y se almacena en array
                            switch (opcion) {
                            case 1:
                                    Docente docente_d = new Doctorado();
                                    docentes[i] = docente_d;
                                    break;
                            case 2:
                                    Docente docente_m = new Maestria();
                                    docentes[i] = docente_m;
                                    break;
                            case 3:
                                    Docente docente_e = new Espesializacion();
                                    docentes[i] = docente_e;
                                    break;
                            case 4:
                                    Docente docente_s_p = new S_Postgrado();
                                    docentes[i] = docente_s_p;
                                    break;
                            }
                            //se piden datos
                            docentes[i].pedir_datos();
                            //se pregunta tip de contratación
                            docentes[i].tipo_contratacion();
                            salario_t += docentes[i].getSalario();
			}
			System.out.println("\nMostrando informacion de docentes:");
			//se muestran docentes e información
			for(int i=0;i<cantidad_docentes;i++) {
				System.out.println("");
				docentes[i].mostrar_datos();
			}
			//se muestra el salario total
			System.out.println("\nEl salario total a pagar por totos los maestros es: "+salario_t);
			//condicional para preguntar y verificar buclo do while
			do {
				System.out.println("Desea hacer otro calculo? (y/n): ");
				desicion = in.readLine();
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