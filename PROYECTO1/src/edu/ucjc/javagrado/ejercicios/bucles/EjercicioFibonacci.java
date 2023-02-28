package edu.ucjc.javagrado.ejercicios.bucles;

import java.util.Scanner;
public class EjercicioFibonacci {
	
	public static void main(String[] args) {
		
		int numero = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("¿Cuántos números quieres mostrar?: ");
		numero = scan.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		for (int cont = 1; cont < numero+1; cont++) {
			System.out.println(num3);
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}

	}

}
