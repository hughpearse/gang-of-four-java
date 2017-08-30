package structural.facade.hometheater;

public class CdPlayer {
	Amplifier amplifier;
	
	
	
	public CdPlayer(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}

	public void on() {
		System.out.println("Cd player on");
	}
	
	public void off() {
		System.out.println("Cd player off");
	}
	
	public void eject() {
		System.out.println("Ejecting CD");
	}
	
	public void pause() {
		System.out.println("Cd Paused");
	}
	
	public void play(int track) {
		System.out.println("Playing tack #" + track);
	}
	
	public void play(String title) {
		System.out.println("Playing title: " + title);
	}
	
	public void stop() {
		System.out.println("Stopping CD");
	}
}
