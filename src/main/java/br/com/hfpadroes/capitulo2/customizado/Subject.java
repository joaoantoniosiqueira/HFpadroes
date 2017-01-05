package br.com.hfpadroes.capitulo2.customizado;

public interface Subject {

	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
