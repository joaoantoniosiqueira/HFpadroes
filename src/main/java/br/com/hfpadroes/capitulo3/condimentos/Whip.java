package br.com.hfpadroes.capitulo3.condimentos;

import br.com.hfpadroes.capitulo3.Beverage;
import br.com.hfpadroes.capitulo3.CondimentDecorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
