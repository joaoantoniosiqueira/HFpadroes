package br.com.hfpadroes.capitulo3;

public abstract class CondimentDecorator extends Beverage {

	public Beverage beverage;
	public abstract String getDescription();
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}
}
