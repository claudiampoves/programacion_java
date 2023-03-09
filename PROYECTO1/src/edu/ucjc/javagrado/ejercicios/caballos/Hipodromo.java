package edu.ucjc.javagrado.ejercicios.caballos;

public class Hipodromo {

	public static void main(String[] args) {
		Caballo caballo1 = new Caballo("Taruger", 1, 40, 210, 12);
		Caballo caballo2 = new Caballo("Pumuki", 2, 80, 402, 16);
		Caballo caballo3 = new Caballo("Doff", 3, 65, 330, 15);
		
		//Defino variables y les doy valor por defecto
		String nombreCarrera = "Cto1";
		int distanciaCarrera = 1000;
		if (args.length>0) {
			nombreCarrera = args[0];
			distanciaCarrera = Integer.parseInt(args[1]);
		}
		
		Carrera carrera = new Carrera (nombreCarrera, distanciaCarrera, null);
		
		Caballo [] cajon = new Caballo [3];
		cajon[0] = caballo1;
		cajon[1] = caballo2;
		cajon[2] = caballo3;
		
		carrera.setCajon(cajon);
		
		carrera.iniciarCarrera();
		Caballo caballo = carrera.iniciarCarrera();
		System.out.println("Ha ganado el caballo " + caballo.getNombre() + " con dorsal " + caballo.getDorsal());
	}

}
