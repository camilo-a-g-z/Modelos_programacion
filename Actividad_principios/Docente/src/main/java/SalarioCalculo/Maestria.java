package SalarioCalculo;

public class Maestria extends Docente{
	//se crea constructor con salario
	Maestria (){
		salario = 5000000.0;
	}
	//metodo para mostrar datos
	void mostrar_datos() {
		System.out.println("El docente "+getNombre()+" "+getApellido()+" con el titulo de Maestria");
		System.out.println("Contratado como: "+tipo_c);
		System.out.println("Con el salario de: "+salario);
	}
}