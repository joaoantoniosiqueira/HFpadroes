package br.com.hfpadroes.capitulo1.animais.comportamentos.quack;

import br.com.hfpadroes.capitulo1.animais.comportamentos.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		
		System.out.println("... ... ...");
	}

}
