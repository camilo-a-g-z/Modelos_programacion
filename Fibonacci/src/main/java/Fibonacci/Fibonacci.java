package Fibonacci;
/*
* Programa: Programa que calcula la serie de fibonacci
* Autor: Camilo Andres Garcia Zambrano
* Fecha: 20/11/2020
* */

public class Fibonacci {
	//se declaran atributos
	private int numero;
	
	//se declaran metodos
	int encontrar_fibo(int n) {
		//si el numero es 1 o 0
		if(n<2) {
			//devuleve 1 o 0
			return n;
		}else {
			//devuelve la suma de los anteriores
			return encontrar_fibo(n-1)+encontrar_fibo(n-2);
		}
	}
	
	void fibo_itera() {
		//se crean variables auxiliares
		int x=0;
		int y=1;
		int z=1;
		//se muestra primer uno de la serie
		
		System.out.print(0+" "+1+" ");
		for(int i=1;i<numero-1;i++) {
			//se crea algoritmo fibonacci
			z = x+y;
			System.out.print(z+" ");
			//se aumenta serie
			x=y;
			y=z;
		}
	}
	
	void mostrar_serie() {
		//buclu para mostrar serie
		for(int i=0;i<numero;i++) {
			//se muestra numero en serie
			System.out.print(encontrar_fibo(i)+" ");
		}
	}
	
	//se generan setters y getters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
