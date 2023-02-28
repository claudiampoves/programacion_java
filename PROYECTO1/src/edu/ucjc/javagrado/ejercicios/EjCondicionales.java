package edu.ucjc.javagrado.ejercicios;

import java.util.Scanner;
public class EjCondicionales {
	//Darle un valor a la variable mes y decir en que estación estamos

	public static void main(String[] args) {
		String mes = ""; 
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce el nombre del mes: ");
		mes = scan.nextLine();
		
		
		//Usando if
		String estacion = mes;
		if (estacion.equalsIgnoreCase("Enero") || estacion.equalsIgnoreCase("Febrero") || estacion.equalsIgnoreCase("Marzo")) {
			estacion = "Invierno";
		}
		else if (estacion.equalsIgnoreCase("Abril")|| estacion.equalsIgnoreCase("Mayo") || estacion.equalsIgnoreCase("Junio")) {

			estacion = "Primavera";
		}
		else if (estacion.equalsIgnoreCase("Julio") || estacion.equalsIgnoreCase("Agosto") || estacion.equalsIgnoreCase("Septiembre")) {
			estacion = "Verano";
		}
		else if (estacion.equalsIgnoreCase("Octubre") || estacion.equalsIgnoreCase("Noviembre") || estacion.equalsIgnoreCase("Diciembre")) {
			estacion = "Otoño";
		}
		else {
			System.out.println("Te has equivocado");
		}
		System.out.println(estacion);
		
		
		//Con switch
		switch (mes.toLowerCase()) {
			case "enero": 
			case "febrero": 
			case "marzo": System.out.println("Estamos en invierno"); break;
			case "abril": 
			case "mayo": 
			case "junio": System.out.println("Estamos en primavera"); break;
			case "julio": 
			case "agosto": 
			case "septiembre": System.out.println("Estamos en verano"); break;
			case "octubre": 
			case "noviembre": 
			case "dciiembre": System.out.println("Estamos en otoño"); break;
		
		}

	}

}
