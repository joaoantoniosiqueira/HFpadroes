package br.com.hfpadroes.capitulo3;

import br.com.hfpadroes.capitulo3.bebidas.DarkRoast;
import br.com.hfpadroes.capitulo3.bebidas.Expresso;
import br.com.hfpadroes.capitulo3.bebidas.HouseBlend;
import br.com.hfpadroes.capitulo3.condimentos.Mocha;
import br.com.hfpadroes.capitulo3.condimentos.Soy;
import br.com.hfpadroes.capitulo3.condimentos.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {

		Beverage expresso = new Expresso();
		System.out.println(expresso.getDescription() + " $" + expresso.cost());
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
	}

}
