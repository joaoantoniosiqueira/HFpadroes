package br.com.hfpadroes.capitulo1.animais.comportamentos.fly;

import br.com.hfpadroes.capitulo1.animais.comportamentos.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public String fly() {
		return("Eu estou voando com um foquete!");
	}

}
