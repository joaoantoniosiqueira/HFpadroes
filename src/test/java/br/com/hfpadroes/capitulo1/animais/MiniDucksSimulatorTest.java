package br.com.hfpadroes.capitulo1.animais;

import br.com.hfpadroes.capitulo1.animais.comportamentos.fly.FlyRocketPowered;
import br.com.hfpadroes.capitulo1.animais.pato.MallardDuck;
import junit.framework.TestCase;

public class MiniDucksSimulatorTest extends TestCase {

	public void testAssertions(){
		Duck mallard = new MallardDuck();
		
		assertEquals(mallard.performQuack(), "Quack... Quack... Quack...");
		assertEquals(mallard.performFly(), "Voando com assas!");
		
		Duck model = new ModelDuck();
		
		assertEquals(model.performFly(), "Não voa! Não sai do lugar!");
		
		model.setFlyBehavior(new FlyRocketPowered());
		
		assertEquals(model.performFly(), "Eu estou voando com um foquete!");
		assertEquals(model.performQuack(), "Quack... Quack... Quack...");
	}
}
