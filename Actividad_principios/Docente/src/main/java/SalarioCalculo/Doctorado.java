package SalarioCalculo;

/**
 *
 * @author User
 */
public class Doctorado extends Docente {
	//se crea constructor con salario
	Doctorado(){
		salario = 7000000.0;
	}
	//metodo para mostrar datos
	void mostrar_datos() {
		System.out.println("El docente "+getNombre()+" "+getApellido()+" con el titulo de Doctorado");
		System.out.println("Contratado como: "+tipo_c);
		System.out.println("Con el salario de: "+salario);
	}
}