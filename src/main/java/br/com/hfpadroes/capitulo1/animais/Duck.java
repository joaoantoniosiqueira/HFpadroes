package br.com.hfpadroes.capitulo1.animais;

import br.com.hfpadroes.capitulo1.animais.comportamentos.FlyBehavior;
import br.com.hfpadroes.capitulo1.animais.comportamentos.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	String swim(){
		return "pato nadando!";
	}
	
	public abstract String display();
	
	public String performFly(){
		return flyBehavior.fly();
	}
	
	public String performQuack(){
		return quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
