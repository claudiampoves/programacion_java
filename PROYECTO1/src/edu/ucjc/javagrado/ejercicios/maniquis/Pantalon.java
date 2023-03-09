package edu.ucjc.javagrado.ejercicios.maniquis;

public class Pantalon {

	private String talla;
	private double precio;
	private String color;
	private Boton boton;
	
	public Pantalon(String talla, double precio, String color, Boton boton) {
		super();
		this.talla = talla;
		this.precio = precio;
		this.color = color;
		this.boton = boton;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boton getBoton() {
		return boton;
	}
	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
	
}	
