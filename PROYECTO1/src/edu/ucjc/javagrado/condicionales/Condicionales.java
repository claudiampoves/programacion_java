package edu.ucjc.javagrado.condicionales;

public class Condicionales {

	public static void main(String[] args) {
	
		int num1 = 9;
		int num2 = 8;
		
		//If
		if (num1 < num2 || num1 > 0) {	
			System.out.println("Num1 es mayor que num2");
		}else if (num1 < 0 ) {
			System.out.println("Num1 es menor que 0");
		} else {
			System.out.println("No se cumple ninguna condición");
		}
		
		
		//Switch
		String letra = "N";
		switch (letra) {
			case "A": System.out.println("El valor de A");break;
			case "E": System.out.println("El valor de E");break;
			case "I": System.out.println("El valor de I");break;
			case "O": System.out.println("El valor de O");break;
			case "U": System.out.println("El valor de U");break;
			default: System.out.println("Es una consonante");break;
		}

	}

}
