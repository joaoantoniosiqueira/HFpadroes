package br.com.hfpadroes.capitulo3.bebidas;

import br.com.hfpadroes.capitulo3.Beverage;

public class Expresso extends Beverage {

	public Expresso() {
		description = "Expresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
