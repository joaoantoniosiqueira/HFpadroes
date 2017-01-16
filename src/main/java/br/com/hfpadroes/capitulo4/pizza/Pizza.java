package br.com.hfpadroes.capitulo4.pizza;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	
	void prepare(){
		System.out.println("Prepering " + name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauge ...");
		System.out.println("Adding toppings: ");
		for (String string : toppings) {
			System.out.println(" " + string);
		}
	}
	
	void bake(){
		System.out.println("Assar por 25 minutos a 350°");
	}
	
	void cut(){
		System.out.println("Cortando a pizza em fatias diagonais");
	}
	
	void box(){
		System.out.println("Coloque a pizza na embalagem oficial");
	}
	
	public String getName(){
		return name;
	}
}
