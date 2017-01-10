package br.com.hfpadroes.capitulo3;

public abstract class Beverage {

	protected String description = "Bebida desconhecida";
	public enum Size {TALL, GRANDE, VENTI};
	protected Size size = Size.TALL;

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
}
