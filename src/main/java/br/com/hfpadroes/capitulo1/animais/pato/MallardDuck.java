package br.com.hfpadroes.capitulo1.animais.pato;

import br.com.hfpadroes.capitulo1.animais.Duck;
import br.com.hfpadroes.capitulo1.animais.comportamentos.fly.FlyWithWings;
import br.com.hfpadroes.capitulo1.animais.comportamentos.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public String display() {
		return("Eu sou um pato malhado!");
	}
}
