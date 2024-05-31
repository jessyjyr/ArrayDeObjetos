package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Coche {
	// estas variables son de instancia, porque no se han instanciado todavia

	private String marca;
	private String modelo;
	
	public static final String paisDelFabricante = "Alemania";
			
}
