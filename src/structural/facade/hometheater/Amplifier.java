package structural.facade.hometheater;

public class Amplifier {
	Tuner tuner;
	DvdPlayer dvdplayer;
	CdPlayer cdplayer;
	
	public void on() {
		System.out.println("Amplifier on");
	}
	
	public void off() {
		System.out.println("Amplifier off");
	}
	
	public void setCd(CdPlayer cdplayer) {
		this.cdplayer = cdplayer;
	}
	
	public void setDvd(DvdPlayer dvdplayer) {
		this.dvdplayer = dvdplayer;
	}
	
	public void setStereoSound() {
		System.out.println("Sterio sound on");
	}
	
	public void setSurroundSound() {
		System.out.println("Surround sound (Dolby 7.1) on");
	}
	
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}
	
	public void setVolume(int level) {
		System.out.println("Setting volume to " + level);
	}
}
