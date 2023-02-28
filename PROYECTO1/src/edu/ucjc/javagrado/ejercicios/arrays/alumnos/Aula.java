package edu.ucjc.javagrado.ejercicios.arrays.alumnos;

import edu.ucjc.javagrado.POO.encapsulacion.Asignatura;

public class Aula {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Nombre1", "Apellidos1");
		System.out.println(alumno1.getNombre());
		
		Asignatura asignatura1 = new Asignatura("Asinatura1", 8.0);
		Asignatura asignatura2 = new Asignatura("Asinatura1", 6.0);
		Asignatura asignatura3 = new Asignatura("Asignatura3", 5.0);
		
		Asignatura[] asignaturas = {asignatura1, asignatura2};
		
		alumno1.setAsignaturas(asignaturas);
		
		System.out.println(alumno1.getAsignaturas()[1].getNota());
		
		Asignatura[] asignaturasAlumno1 = alumno1.getAsignaturas();
		
		//Booleano para saber si encuentro una asignatura
		boolean asignaturaEncontrada = false; 
		
		for (Asignatura asignatura : asignaturasAlumno1) {
			if (asignatura.getNombre().equals("Asignatura1")) {
				System.out.println("La nota de la Asignatura1 del alumno " + alumno1.getNombre() + "es " + asignatura.getNota());
				asignaturaEncontrada = true; 
				break;
				
			} 
			//Else no sirve porque aparece tantas veces como asignatura
			/*else {
				System.out.println("El alumno" + alumno1.getNombre()  + "no tiene Asignatura3");
				
			}*/
		}
		if (!asignaturaEncontrada) {
			System.out.println("El alumno" + alumno1.getNombre()  + "no tiene Asignatura3");
		}
	}

}
