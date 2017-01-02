package br.com.hfpadroes.capitulo1.animais.comportamentos.fly;

import br.com.hfpadroes.capitulo1.animais.comportamentos.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		
		System.out.println("Voando com assas!");
	}

}
