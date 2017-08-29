package behavioural.observer.weatherstationclassic;

import java.util.ArrayList;

public class WeatherDataSubject implements ISubject {
	private ArrayList<IObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataSubject() {
		this.observers = new ArrayList<IObserver>();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			IObserver o = observers.get(i);
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
}
