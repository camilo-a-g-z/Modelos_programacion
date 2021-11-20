package SalarioCalculo;

import java.util.Scanner;

public class Docente {
	//se crean atributos
	protected double salario;
	private String nombre;
	private String apellido;
	protected String tipo_c = "Docente de planta";
	//se crea variable para leer datos
	Scanner entrada = new Scanner(System.in);
	//se crean metodos
	void pedir_datos() {
		//se piden datos
		System.out.println("Digite nombre de docente: ");
		nombre = entrada.nextLine();
		System.out.println("Digite apellido del docente: ");
		apellido = entrada.nextLine();
	}
	
	void d_vinculacion_especial() {
		//se reajusta el tipo de docente
		tipo_c = "Docente de Vinculacion especial";
		//se calcula el 85% del salario
		salario *= 0.85;
	}
	
	void tipo_contratacion() {
		int opcion;
		//bucle para comprobar valides de la opcion
		do {
			//se pregunta tipo de contratacion
			System.out.println("");
			System.out.println("Tipo de contratacion: 1)Docente de planta\t2)Vinculaci�n especial\t3)Catedratico");
			System.out.println("Opcion: ");
			opcion = entrada.nextInt();
			if(opcion>3||opcion<1) {
				System.out.println("Opcion invalida.");
			}
		}while(opcion>3||opcion<1);
		//se crea switch para generar salario
		switch(opcion) {
		case 2:
			d_vinculacion_especial();
			break;
		case 3:
			hora_catedratico();
			break;
		}
	}
	
	void hora_catedratico() {
		//se reajusta el tipo de docente
		tipo_c = "Docente catedratico";
		//se crea variables para hora
		double horas;
		//bucle para comprobar horas
		do {
			//se piden horas
			System.out.println("Digite horas mensuales realizadas: ");
			//se calcula salario
			horas = entrada.nextDouble();
			//buclu para mensaje de horas invalidas
			if(horas>76||horas<32) {
				System.out.println("");
				System.out.println("Cantidad de horas invalidas, ingrese nuevamente una cantidad valida.");
				System.out.println("");
			}
		}while(horas>76||horas<32);
		d_catedraticos(horas);
	}
	void mostrar_datos() {
		
	}
	void d_catedraticos(double horas) {
		//se crea variable auxiliar
		double aux;
		//se divide el salario en la cantidad de dias
		aux = salario/30.0;
		//se coje el 10%
		aux *=0.1;
		//se multiplica ese porcentajes por la cantdad de horas
		salario = aux*horas;
	}
	
	//se crean setters y getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Double getSalario() {
		return salario;
	}
}
