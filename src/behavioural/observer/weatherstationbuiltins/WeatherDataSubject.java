package behavioural.observer.weatherstationbuiltins;
import java.util.Observable;

public class WeatherDataSubject extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataSubject() { }
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		super.setChanged();
		super.notifyObservers();
	}
}
