package Fibonacci;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calcular_Fibonacci {
	public static void main(String[] arg) throws IOException{
		//mensaje de bienvenida
		System.out.println("Bienvenido al programa que calcula serie fibonacci.");
		System.out.println("");
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		//se crean variables
		Fibonacci serie = new Fibonacci();
		boolean comprobar = true;
		String desicion = "";
		do {
			System.out.println("");
			//bucle para confirmar numero operable
			do {
				//se guardan datos
				System.out.println("Digite el numero de elementos de la serie: ");
				serie.setNumero(Integer.parseInt(in.readLine()));
				if(serie.getNumero()<=0||serie.getNumero()>=100) {
					System.out.println("Numero no operable.");
				}
			}while(serie.getNumero()<=0||serie.getNumero()>=100);
			//se muestra la serie
			System.out.print("La serie en recursion es: ");
			serie.mostrar_serie();
			System.out.println("");
			System.out.print("La serie en iteracion es: ");
			serie.fibo_itera();
			System.out.println("");
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
		
		System.out.println("");
		//mensaje de despedida
		System.out.println("Gracias por implementar nuestro software");
	}
}