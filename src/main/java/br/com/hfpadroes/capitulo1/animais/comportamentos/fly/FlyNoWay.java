package br.com.hfpadroes.capitulo1.animais.comportamentos.fly;

import br.com.hfpadroes.capitulo1.animais.comportamentos.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		
		System.out.println("Não voa! Não sai do lugar!");
	}

}
