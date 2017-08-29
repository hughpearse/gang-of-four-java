package behavioural.observer.weatherstationclassic;

public interface ISubject {
	abstract void registerObserver(IObserver o);
	abstract void removeObserver(IObserver o);
	abstract void notifyObservers();
}
