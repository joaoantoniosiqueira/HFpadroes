package br.com.hfpadroes.capitulo4.pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "Estilo Chicago como muito molho e queijo";
		dough = "Molho extra por cima";
		sauce = "Molho de tomate";
		toppings.add("Muita mussarela");
	}
	
	@Override
	void cut() {
		System.out.println("Cortando a patia em pedaçõs quadrados");
	}
}
