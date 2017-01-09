package br.com.hfpadroes.capitulo3;

public abstract class Beverage {

	protected String description = "Bebida desconhecida";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
