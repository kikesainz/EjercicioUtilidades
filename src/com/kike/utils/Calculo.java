package com.kike.utils;

public class Calculo {

	private Calculo() {
		throw new IllegalStateException("Utility class");
	}
	
	public static double calcularIndiceGrasaCorporal(double estatura, double kgs) {
		return kgs /  Math.pow(estatura, 2);
	}
	
	public static double calcularAreaCuadrado(double lado) {
		return Math.pow(lado, 2);
	}
}
