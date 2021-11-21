/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalarioCalculo;

/**
 *
 * @author User
 */
public class Espesializacion extends Docente{
	//se crea constructor con salario
	Espesializacion(){
		salario = 4000000.0;
	}
	//metodo para mostrar datos
	void mostrar_datos() {
		System.out.println("El docente "+getNombre()+" "+getApellido()+" con el titulo de Espesialisaci�n");
		System.out.println("Contratado como: "+tipo_c);
		System.out.println("Con el salario de: "+salario);
	}
}
