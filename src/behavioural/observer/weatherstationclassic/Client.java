package behavioural.observer.weatherstationclassic;

public class Client {

	public static void main(String[] args) {
		/*
		 * Description:
		 * Observers subscribe to subjects.
		 * Observers implement an update method.
		 * Subjects manage subscribed observers and periodically call their update() methods
		 * 
		 * Output:
		 * Current conditions: 15.5C, 75.0% humidity, 110.0 Bar
		 * Current conditions: 16.7C, 85.0% humidity, 120.0 Bar
		 * Current conditions: 17.8C, 95.0% humidity, 130.0 Bar
		 * Current conditions: 19.1C, 100.0% humidity, 130.0 Bar
		 */
		WeatherDataSubject wds = new WeatherDataSubject();
		//notice how cco is never used, yet it can be seen on standardOut
		CurrentConditionsObserver cco = new CurrentConditionsObserver(wds);
		
		wds.setMeasurements(15.5f, 75.0f, 110f);
		wds.setMeasurements(16.7f, 85.0f, 120f);
		wds.setMeasurements(17.8f, 95.0f, 130f);
		wds.setMeasurements(19.1f, 100.0f, 130f);
	}

}
