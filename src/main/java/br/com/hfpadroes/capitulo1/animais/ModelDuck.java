package br.com.hfpadroes.capitulo1.animais;

import br.com.hfpadroes.capitulo1.animais.comportamentos.fly.FlyNoWay;
import br.com.hfpadroes.capitulo1.animais.comportamentos.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public String display() {
		return("Eu sou um modelo de pato!");
	}

}
