package br.com.hfpadroes.capitulo1.animais.comportamentos.quack;

import br.com.hfpadroes.capitulo1.animais.comportamentos.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public String quack() {
		
		return("zuadinha do pato de borracha!");
	}

}
