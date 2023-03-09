package edu.ucjc.javagrado.ejercicios.maniquis;

public class Camisa {

	private String talla;
	private double precio;
	private String color;
	private Boton[] botones;
	
	public Camisa(String talla, double precio, String color, Boton[] botones) {
		super();
		this.talla = talla;
		this.precio = precio;
		this.color = color;
		this.botones = botones;
	}
	
	
	public Camisa(String talla, double precio, String color) {
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
	public Boton[] getBotones() {
		return botones;
	}
	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}
	
	
}
