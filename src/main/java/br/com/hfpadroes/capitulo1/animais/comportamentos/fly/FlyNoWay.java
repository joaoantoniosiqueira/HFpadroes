package br.com.hfpadroes.capitulo1.animais.comportamentos.fly;

import br.com.hfpadroes.capitulo1.animais.comportamentos.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public String fly() {
		
		return("Não voa! Não sai do lugar!");
	}

}
