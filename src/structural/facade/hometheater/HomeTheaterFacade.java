package structural.facade.hometheater;

public class HomeTheaterFacade {
	private Amplifier amplifier;
	private Tuner tuner;
	private DvdPlayer dvdplayer;
	private CdPlayer cdplayer;
	private Projector projector;
	private TheaterLights theaterlights;
	private Screen screen;
	private PopcornPopper popcornpopper;
	public HomeTheaterFacade(Amplifier amplifier, 
								Tuner tuner, 
								DvdPlayer dvdplayer, 
								CdPlayer cdplayer, 
								Projector projector,
								TheaterLights theaterlights, 
								Screen screen, 
								PopcornPopper popcornpopper) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdplayer = dvdplayer;
		this.cdplayer = cdplayer;
		this.projector = projector;
		this.theaterlights = theaterlights;
		this.screen = screen;
		this.popcornpopper = popcornpopper;
	}
	
	public void watchMovie() {
		System.out.println("Get ready to watch a movie...");
		popcornpopper.on();
		popcornpopper.pop();
		theaterlights.dim();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvdplayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		dvdplayer.on();
		dvdplayer.play("The great escape");
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popcornpopper.off();
		theaterlights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdplayer.stop();
		dvdplayer.eject();
		dvdplayer.off();
	}
	
	public void listenToCd() {
		System.out.println("Get ready for an audiophile experence...");
		theaterlights.on();
		amplifier.on();
		amplifier.setVolume(5);
		amplifier.setCd(cdplayer);
		amplifier.setStereoSound();
		cdplayer.on();
		cdplayer.play("Ricky martin - \"Loca\" album");
	}
	
	public void endCd() {
		System.out.println("Shutting down CD...");
		amplifier.off();
		amplifier.setCd(cdplayer);
		cdplayer.eject();
		cdplayer.off();
	}
	
	public void listenToRadio() {
		System.out.println("Tuning in the airwaves...");
		tuner.on();
		tuner.setChannel(98.8d);
		amplifier.on();
		amplifier.setVolume(5);
		amplifier.setTuner(tuner);
	}
	
	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		tuner.off();
		amplifier.off();
	}
}
