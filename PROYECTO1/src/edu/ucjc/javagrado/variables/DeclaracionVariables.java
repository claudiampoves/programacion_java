package edu.ucjc.javagrado.variables;

public class DeclaracionVariables {
	//Variable de distancia o de clase. Se inicializan de manera automática. Desde 0
	static int numero4;
	/**
	 * Comentarios de Javadoc
	 * @param args
	 */

	public static void main(String[] args) {
		//Comentario de línea
		
//		asd
//		asd
//		asd
		
		/*
		 * Comentario de bloque
		 */
		
		//Tipos de datos
		int numero = 12;
		double numeroDecimal = 7.5;
		boolean isMayorEdad = true;
		String nombre = "Claudia";
		
		//Arrays
		int [] numeros = {1,2,3,4};
		
		System.out.println("Hola " + numero + 9);    //Hola 129
		System.out.println("Suma: " + (numero + 9)); //Suma 21
		
		String numero2 = "24";
		
		//int resultado = numero + numero2 //Error pq sumas un entero con cadena de texto	
		//Clase "Integer" // método ".parseInt" para pasar a entero
		int resultado = numero + Integer.parseInt(numero2);  // 36
		System.out.println(resultado);
		//Si numero2 = 24.5 da error pq no es un numero entero
		double numero3 = Double.parseDouble(numero2);
		System.out.println(numero3);
		
		//Variable de método. Decladara dentro de un método (main)
		int num; //Declaración de una variable
		num = 8; //Inicialización una variable
		int num2 = 5; //Declarar e inicializar 
		
		//Print variable de distancia o de clase
		System.out.println("numero " + numero4);
		
		

	}

}
