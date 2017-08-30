package structural.facade.hometheater;

public class Projector {
	DvdPlayer dvdplayer;
	
	public Projector(DvdPlayer dvdplayer) {
		super();
		this.dvdplayer = dvdplayer;
	}

	public void on() {
		System.out.println("Projector on");
	}
	
	public void off() {
		System.out.println("Projector off");
	}
	
	public void tvMode() {
		System.out.println("Projector configured with 4:3 aspect ratio");
	}
	
	public void wideScreenMode() {
		System.out.println("Projector configured with 16:9 aspect ratio");
	}
}
