package edu.ucjc.javagrado.ejercicios.maniquis;

public class Maniqui {

	private long id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	
	public Maniqui(long id) {
		super();
		this.id = id;
		System.out.println("Creando maniquí " + id + " desnudo");
	}

	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
		System.out.println("Vistiendo al maniqui " + id + " con vestido de color " + vestido.getColor());
	}

	public Maniqui(long id, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
		System.out.println("Vistiendo al maniqui "+ " con camisa y pantalon");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	//Funciones
	public void vestir (Camisa camisa, Pantalon pantalon) {
		System.out.println("Vistiendo al maniqui con id " + this.getId() + " con un pantalón y camisa");
		this.camisa = camisa;
		desvestir ();
		this.pantalon = pantalon;
	}
	
	public void vestir ( Vestido vestido) {
		System.out.println("Vistiendo al maniqui con id "+this.getId()+" con un vestido de color "+vestido.getColor());
		desvestir();
		this.vestido = vestido;
	}
	
	public void desvestir() {
		System.out.println("Desvistiendo al maniqui " + this.id);
		if (tieneCamisa())
			quitarCamisa();
		
		if (pantalon != null)
			pantalon = null;
		
		if (vestido != null)
			vestido = null;		
	}
	
	private void quitarCamisa() {
		setCamisa(null);
	}
	
	private boolean tieneCamisa() {
		return camisa != null;
	}

	
}
