/*
    @author Camilo Andres Garcia Zambrano
    Clase hija de docente en la que se seetea el salario
    @version 20/11/2021
*/
package SalarioCalculo;

public class S_Postgrado extends Docente{
	//se crea constructor con salario
	S_Postgrado(){
		salario = 3000000.0;
	}
	//metodo para mostrar datos
	void mostrar_datos() {
		System.out.println("El docente "+getNombre()+" "+getApellido()+" sin titulo de postgrado");
		System.out.println("Contratado como: "+tipo_c);
		System.out.println("Con el salario de: "+salario);
	}
}
