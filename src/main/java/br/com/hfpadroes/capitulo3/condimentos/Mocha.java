package br.com.hfpadroes.capitulo3.condimentos;

import br.com.hfpadroes.capitulo3.Beverage;
import br.com.hfpadroes.capitulo3.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
