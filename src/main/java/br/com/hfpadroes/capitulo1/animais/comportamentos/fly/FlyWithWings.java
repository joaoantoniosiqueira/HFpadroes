package br.com.hfpadroes.capitulo1.animais.comportamentos.fly;

import br.com.hfpadroes.capitulo1.animais.comportamentos.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public String fly() {
		
		return("Voando com assas!");
	}

}
