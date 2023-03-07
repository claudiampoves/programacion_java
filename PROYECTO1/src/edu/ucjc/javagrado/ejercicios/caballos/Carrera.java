package edu.ucjc.javagrado.ejercicios.caballos;

public class Carrera {
	private String nombreCarrera;
	private double distancia;
	private int caballos;
	private String cajon [];
	public Carrera(String nombreCarrera, double distancia, int caballos, String[] cajon) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.distancia = distancia;
		this.caballos = caballos;
		this.cajon = cajon;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public String[] getCajon() {
		return cajon;
	}
	public void setCajon(String[] cajon) {
		this.cajon = cajon;
	}
	
	public static void iniciarCarrera() {
		
	}
}
