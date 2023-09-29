package com.kike.flow;

import com.kike.personas.Persona;
import com.kike.utils.Calculo;

public class Flow {
	
	public Flow() {
		Persona p = new Persona("Rubén", 1.85, 77);
		
		System.out.println("Método de la clase Persona:");
		p.calcularIndiceGrasaCorporalPersona();
		System.out.println(p.toString());
		
		System.out.println("\nMétodo estático de la clase Calculo:");
		System.out.println(Math.round(Calculo.calcularIndiceGrasaCorporal(1.85, 77) * 100.0) / 100.0);
	}
}
