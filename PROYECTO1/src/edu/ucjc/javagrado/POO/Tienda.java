package edu.ucjc.javagrado.POO;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		Cliente c1 = new Cliente();  //Crear objeto vacío / Clase: Cliente / Variable: c1.
		c1.nombre = "Juan"; 
		c1.comprar(); //Llamada al método comprar 
		
		System.out.println(c1.nombre);
		Cliente c2 = c1; //Crear variable q apunta al objeto c1
		c2.nombre = "María";
		System.out.println(c1.nombre); //Pinta maría pq apunta a c1 
		//En este código hay 2 variables apuntando a 1 objeto
		
		System.out.println(c1.nombre);
		
		c2 = null; //null = Variable q no apunta a ningun objeto. Se produce una excepción
		//System.out.println(c2.nombre);
		
		System.out.println(c1.apellidos);
		System.out.println(c1.edad);
		
		

	}

}
