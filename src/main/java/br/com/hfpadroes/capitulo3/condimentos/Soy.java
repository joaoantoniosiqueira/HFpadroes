package br.com.hfpadroes.capitulo3.condimentos;

import br.com.hfpadroes.capitulo3.Beverage;
import br.com.hfpadroes.capitulo3.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverege;
	
	public Soy(Beverage beverege) {
		this.beverege = beverege;
	}

	@Override
	public String getDescription() {
		return beverege.getDescription() + ", Soy";
	}
	
	@Override
	public double cost() {
		return .15 + beverege.cost();
	}

}
