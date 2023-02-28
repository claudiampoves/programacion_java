package edu.ucjc.javagrado.POO.encapsulacion;

public class Universidad {

	public static void main(String[] args) {
		//new Alumno() es un constructor por defecto de una clase. 
		Alumno alumno1 = new Alumno("Nombre1", "Apellido1", 23, "123A"); 
		//Al meter lo parámetros en el paréntesis, deja de ser un constructor por defecto
		
		//System.out.println(alumno1.)

		System.out.println(alumno1.getNombre());
		alumno1.setNombre("Nombre2");
		System.out.println(alumno1.getNombre());
		
		System.out.println(alumno1.getApellidos());
		alumno1.setApellidos("Apellidos2");
		System.out.println(alumno1.getApellidos());

			
		Asignatura asignatura1 = new Asignatura("Programación", 8);
		alumno1.setAsignatura(asignatura1); 
		System.out.println(alumno1.getAsignatura().getNota());
		
	}
	
}
