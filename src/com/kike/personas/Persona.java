package com.kike.personas;

public class Persona {
	private String nombre;
	private double estatura;
	private double kgs;
	private double igc;
	
	public Persona(String nombre, double estatura, double kgs) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.kgs = kgs;
	}
	
	public  void calcularIndiceGrasaCorporalPersona() {
		igc = kgs /  Math.pow(estatura, 2);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", estatura=" + estatura + ", kgs=" + kgs + ", Índice de grasa corporal= "+ Math.round(igc * 100.0) / 100.0  + "]";
	}

}
