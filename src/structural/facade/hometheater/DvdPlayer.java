package structural.facade.hometheater;

public class DvdPlayer {
	Amplifier amplifier;
	
	public DvdPlayer(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}

	public void on() {
		System.out.println("DVD player on");
	}
	
	public void off() {
		System.out.println("Cd player off");
	}
	
	public void eject() {
		System.out.println("Ejecting DVD");
	}
	
	public void pause() {
		System.out.println("Pausing DVD");
	}
	
	public void play(String movie) {
		System.out.println("Playing movie: " + movie);
	}
	
	public void play(int track) {
		System.out.println("Playing DVD chapter #" + track);
	}
	
	public void setSurroundAudio() {
		System.out.println("Setting DVD player surround sound");
	}
	
	public void setTwoChannelAudio() {
		System.out.println("Setting DVD player sterio sound");
	}
	
	public void stop() {
		System.out.println("Stopping DVD");
	}
}
