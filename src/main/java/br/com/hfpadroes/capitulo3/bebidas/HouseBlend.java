package br.com.hfpadroes.capitulo3.bebidas;

import br.com.hfpadroes.capitulo3.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
