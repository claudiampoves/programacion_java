package edu.ucjc.javagrado.POO.encapsulacion;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad; 
	private String dni;
	private Asignatura asignatura; //No se pone String pq asignatura es una clase
	
	//Constructores
	public Alumno(String nombre, String apellidos, int edad, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	
	
	
	/*
	//Constructores
	//La calse alumno está encapsulada
	Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	//Otro constructor = sobrecarga de constructores
	Alumno(String nombre, String apellidos, int edad, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}
	
		//Método string (lo que devuelve) getVariable 
		//Get: Obtener
		public String getNombre() {
			return this.nombre;
	}
		//Void: Método que no devuelve nada. Hace una acción pero no devuelve ningún dato.
		//Set: Modificar
		public void setNombre(String nombre) {
			this.nombre = nombre;
	}
		public String getApellidos() {
			return this.apellidos;
	}
	
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
	}
		
		public int getEdad() {
			return this.edad;
	}
		
		public void setEdad(int edad) {
			this.edad = edad;
	}
	*/
		
}
