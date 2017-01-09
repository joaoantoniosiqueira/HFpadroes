package br.com.hfpadroes.capitulo3.bebidas;

import br.com.hfpadroes.capitulo3.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Descafeinado";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
