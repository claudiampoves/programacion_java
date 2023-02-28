package edu.ucjc.javagrado.ejercicios.bucles;
import java.util.Scanner;


import edu.ucjc.javagrado.POO.encapsulacion.Alumno;
import edu.ucjc.javagrado.ejercicios.pojos.Persona;
import edu.ucjc.javagrado.utils.UtilidadesEjercicios;

public class EjercicioMenu {

	public static void main(String[] args) {

		String opcion = "";
		while (opcion != "4") {
			String menu = "1. Opcion1\n2 .Opcion 2";
			String [] menu_array = {"1. Opcion1", "2 .Opcion 2"};
			String menu_caracteres = "1. Opcion1 ;2 .Opcion 2";
			//UtilidadesEjercicios.pintaMenu(menu_array)
			UtilidadesEjercicios.pintaMenu(menu_caracteres,";");
			

			Scanner scan = new Scanner(System.in);
			System.out.println("Escoge una opción: ");
			opcion = scan.nextLine();

			if (opcion.equals("1")) {
				UtilidadesEjercicios.validarEmail();
			} else if (opcion.equals("2")) {
				pintaCuadrado();
			} else if (opcion.equals("3")) {
				mostrarDatos();
			} else if (opcion.equals("4")) {
				System.out.println("Has salido.");
			} else {
				System.out.println("Esta opción no es posible.");
			}
		}

	}

	public static void pintaCuadrado() {
		System.out.println("Pintando cuadrado");
		int numLados = 5;
		for (int i = 0; i < numLados; i++) { // Filas
			for (int j = 0; j < numLados; j++) { // Columnas
				if (i == 0 || i == numLados - 1) { // Primera y última fila
					System.out.print("*\t");
				} else {
					if (j == 0 || j == numLados - 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
			}
			System.out.println();
		}

	}
	// Método mostrarDatos()
	// Crear clase persona (nombre, apellidos, dni (no se modifica), email)
	// 3 objetos de tipo Persona
	// Metemos los objetos en un array
	// Mostrar los nombres de todas las personas del array

	public static void mostrarDatos() {
		// Defino objetos de tipo personas
		Persona persona1 = new Persona("Persona1", "Apellido1", "1111A", "sdfsfdsddf@sdfsddgas");
		Persona persona2 = new Persona("Persona2", "Apellido2", "2222A", "sdfsfdsddf@sdfsddgas");
		Persona persona3 = new Persona("Persona3", "Apellido3", "3333A", "sdfsfdsddf@sdfsddgas");

		// Array de personas
		Persona[] personas = { persona1, persona2, persona3 };

		// System.out.println(personas[0].getNombre());
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}

	}

	/*
	 * int valido = 0; email = email.trim(); int posicionArroba =
	 * email.indexOf("@")+1; int posicionPunto = email.indexOf(".")+1; int
	 * longitudEmail = posicionPunto.lenght; if (!email.contains("@")) { valido = 1;
	 * System.out.println("No es válido. No contiene @."); } else if
	 * ((email.contains(" "))) { valido = 2;
	 * System.out.println("No es válido. Contiene espacios."); }
	 * 
	 * else if (!email.substring(posicionArroba).contains(".")) { valido = 3;
	 * System.out.println("No es válido. No contiene un punto."); } else if
	 * (longitudEmail<=2 && longitudEmail>6) { valido = 4;
	 * System.out.println("No es válido. No tiene los caracteres requeridos"); }
	 */

}
		

