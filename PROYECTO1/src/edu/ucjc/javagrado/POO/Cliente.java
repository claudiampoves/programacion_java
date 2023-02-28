package edu.ucjc.javagrado.POO;

public class Cliente {
	
	//Atributos o variables de instancia
	//Las variables de instancia se inicializan por defecto de manera automática cuando se genera un objeto
	//Los string si no se asigna ningún valor se inicializan en NULL
	private String nombre;
	public String apellidos;
	String dni;
	//Los primitivos se inicializan: int con 0; boolean: false
	protected int edad;
	
	//Constructor
	
	//Métodos
	public void comprar() {
		System.out.println("Cliente" +  nombre + "está comprando.");
		
		//Las variables locales definidas dentro de los métodos hay que inicializarlas antes de utilizarse.
		String test;
		System.out.println(apellidos);
		test = "Hola";
		System.out.println(test);
	}
}
