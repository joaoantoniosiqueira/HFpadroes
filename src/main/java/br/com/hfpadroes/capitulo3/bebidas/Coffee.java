package br.com.hfpadroes.capitulo3.bebidas;

import br.com.hfpadroes.capitulo3.Beverage;

public class Coffee extends Beverage {

	public Coffee() {
		description = "Pure Coffee";
	}
	
	@Override
	public double cost() {
		return .99;
	}

}
