package br.com.hfpadroes.capitulo1.animais;

import br.com.hfpadroes.capitulo1.animais.comportamentos.FlyBehavior;
import br.com.hfpadroes.capitulo1.animais.comportamentos.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	void swim(){
		System.out.println("pato nadando!");
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
