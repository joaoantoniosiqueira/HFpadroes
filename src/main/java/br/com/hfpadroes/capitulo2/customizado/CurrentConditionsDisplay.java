package br.com.hfpadroes.capitulo2.customizado;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private Subject weatherData;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();

	}

	@Override
	public void display() {
		System.out.println("Condições atuais: temperatura: " + temperature + "°F e humidade: " + humidity + "%");
	}

}
