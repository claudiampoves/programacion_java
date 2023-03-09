package edu.ucjc.javagrado.ejercicios.caballos;


public class Carrera {
	private String nombreCarrera;
	private int distancia;
	private Caballo[] cajon;
	
	public Carrera(String nombreCarrera, int distancia, Caballo[] cajon) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.distancia = distancia;
		this.cajon = cajon;
	}



	public String getNombreCarrera() {
		return nombreCarrera;
	}



	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}



	public int getDistancia() {
		return distancia;
	}



	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}



	public Caballo[] getCajon() {
		return cajon;
	}



	public void setCajon(Caballo[] cajon) {
		this.cajon = cajon;
	}

	public Caballo iniciarCarrera() {
		System.out.println("Iniciando la carrera " + this.getNombreCarrera()
		+" con una distancia de "+this.distancia +" metros");
		boolean hayCaballoGanador = false;
		//Creo variable caballo ganador que no apunta a nada.
		Caballo caballoGanador = null;
	
		while (!hayCaballoGanador) {
			for (Caballo caballo : cajon) {
			caballo.correr();
			//Si el avance que lleva el caballo es mayor 
			//que la distancia de la carrera habrá ganado 
				if (caballo.getAvance() >= this.distancia) {
				hayCaballoGanador = true;
				//Si hay caballo ganador que apunte al objeto caballo
				caballoGanador = caballo;
				//System.out.println("Ha ganado el caballo " + caballo.getNombre() + " con dorsal "+ caballo.getDorsal());
				break;
				}
			}
	
		}
		//Devuelve el caballo ganador
		return caballoGanador;
	}
}
