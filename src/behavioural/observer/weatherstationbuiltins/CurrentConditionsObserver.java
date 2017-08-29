package behavioural.observer.weatherstationbuiltins;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObserver implements Observer {
	private Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherDataSubject) {
			WeatherDataSubject wds = (WeatherDataSubject) obs;
			this.temperature = wds.getTemperature();
			this.humidity = wds.getHumidity();
			this.pressure = wds.getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + "C, " + humidity + "% humidity, " + pressure + " Bar");
	}
	
}
