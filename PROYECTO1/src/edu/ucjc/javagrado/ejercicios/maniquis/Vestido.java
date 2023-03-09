package edu.ucjc.javagrado.ejercicios.maniquis;

public class Vestido {

	private String talla;
	private double precio;
	private String color;
	public Vestido(String talla, double precio, String color) {
		super();
		this.talla = talla;
		this.precio = precio;
		this.color = color;
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
	
	
}
