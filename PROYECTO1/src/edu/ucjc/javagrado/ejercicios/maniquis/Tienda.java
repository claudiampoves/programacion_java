package edu.ucjc.javagrado.ejercicios.maniquis;

public class Tienda {
	private String nombre;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	public static void main(String[] args) {
		Tienda tienda = new Tienda("tienda1");
		tienda.abrirTienda();
	}
	
	
	public void abrirTienda () {
		//Crear objetos. Como es un método dinámico y el main es estático se necesita un objeto para invocar el método
		System.out.println("Se está abriendo la tienda " + this.nombre);
		
		Boton[] botones = stockBotones();
		
		Pantalon pantalon = new Pantalon("Vaquero", 30, "L", botones[0]);
		System.out.println(pantalon.getBoton().getColor());
		//Sacamos el boton1 del array para que no se pueda repetir el boton en otro pantalón
		botones[0] = null;
		
		Camisa camisa1 = new Camisa("Blanco", 40, "L");
		camisa1.setBotones(getBotones(botones));
		
		Vestido vestido = new Vestido("M", 50, "Verde");
		
		Maniqui maniqui = new Maniqui(1);
		maniqui.vestir(vestido);
		maniqui.vestir(camisa1, pantalon);
		
		if (maniqui.getVestido() != null) {
			System.out.println(maniqui.getVestido().getPrecio());
		}
		
		Maniqui maniqui2 = new Maniqui (2, vestido);
		
		Maniqui[] maniquisTienda = {maniqui, maniqui2};
		precioManiquis(maniquisTienda);
		
	}
	
	private void precioManiquis(Maniqui[] maniquis) {
		for (Maniqui maniqui : maniquis) {
			double precio = 0;
			if (maniqui.getCamisa() != null) {
				precio += maniqui.getCamisa().getPrecio();
			}
			if (maniqui.getPantalon() != null) {
				precio += maniqui.getPantalon().getPrecio();
			}
			if (maniqui.getVestido() != null) {
				precio += maniqui.getVestido().getPrecio();
			}
			System.out.println("Precio de la roma del maniqui " + maniqui.getId() + " es " + precio);
		}
	}
	
	private Boton[] getBotones(Boton[] botones) {
		int numBotones = 0;
		//Cuento el número de botones que quedan
		for (Boton boton : botones) {
			if (boton != null) {
				numBotones++;
				
			}
		}		
		
		Boton[] botonesExistentes = new Boton[numBotones];
		int i = 0;
		for (Boton boton : botones) {
			if (boton!=null) {
				botonesExistentes[i] = boton;
				i++;
			}
		}
		return botones;
	}
	
	
	private Boton[] stockBotones() { 
		Boton boton1 = new Boton (" Blanco1", "Redondo", "Pequeño");
		Boton boton2 = new Boton (" Blanco2", "Redondo", "Pequeño");
		Boton boton3 = new Boton (" Blanco3", "Redondo", "Pequeño");
		Boton boton4 = new Boton (" Blanco4", "Redondo", "Pequeño");
		Boton boton5 = new Boton (" Blanco5", "Redondo", "Pequeño");
	
		Boton[] botones = {boton1, boton2, boton3, boton4, boton5};
	
		return botones;
	}

}
