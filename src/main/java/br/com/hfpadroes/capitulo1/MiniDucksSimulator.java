package br.com.hfpadroes.capitulo1;

import br.com.hfpadroes.capitulo1.animais.Duck;
import br.com.hfpadroes.capitulo1.animais.ModelDuck;
import br.com.hfpadroes.capitulo1.animais.comportamentos.fly.FlyRocketPowered;
import br.com.hfpadroes.capitulo1.animais.pato.MallardDuck;

public class MiniDucksSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println(mallard.performQuack());
		System.out.println(mallard.performFly());
		
		System.out.println("---------------------------------------------");
		
		Duck model = new ModelDuck();
		System.out.println(model.performFly());
		model.setFlyBehavior(new FlyRocketPowered());
		System.out.println(model.performFly());
	}
}
