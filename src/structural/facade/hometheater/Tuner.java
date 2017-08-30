package structural.facade.hometheater;

public class Tuner {
	Amplifier amplifier;
	
	public Tuner(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}

	public void on() {
		System.out.println("Tuner on");
	}
	
	public void off() {
		System.out.println("Tuner off");
	}
	
	public void setAm() {
		System.out.println("Tuner set to AM mode");
	}
	
	public void setFm() {
		System.out.println("Tuner set to FM mode");
	}
	
	public void setChannel(double channel) {
		System.out.println("Tuner channel set to" + channel);
	}
}
