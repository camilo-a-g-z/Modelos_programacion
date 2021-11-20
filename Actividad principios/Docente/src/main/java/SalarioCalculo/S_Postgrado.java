/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
