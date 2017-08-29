package behavioural.observer.weatherstationclassic;

public interface IObserver {
	abstract void update(float temperature, float humidity, float pressure);
}
