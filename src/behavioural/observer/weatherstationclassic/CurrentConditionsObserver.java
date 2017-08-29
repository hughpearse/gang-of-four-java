package behavioural.observer.weatherstationclassic;

public class CurrentConditionsObserver implements IObserver {
	private float temperature;
	private float humidity;
	private float pressure;
	private ISubject weatherData; 
	
	public CurrentConditionsObserver(ISubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + "C, " + humidity + "% humidity, " + pressure + " Bar");
	}
	
}
