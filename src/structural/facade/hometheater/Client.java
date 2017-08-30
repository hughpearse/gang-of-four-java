package structural.facade.hometheater;

public class Client {

	public static void main(String[] args) {
		/*
		 * Description
		 * all concerete classes
		 * one concerete class that has a bunch of methods to perform groups of common tasks
		 * 
		 * Output:
		 * Get ready for an audiophile experence...
		 * Theater lights on
		 * Amplifier on
		 * Setting volume to 5
		 * Sterio sound on
		 * Cd player on
		 * Playing title: Ricky martin - "Loca" album
		 */
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner(amplifier);
		DvdPlayer dvdplayer= new DvdPlayer(amplifier);
		CdPlayer cdplayer = new CdPlayer(amplifier);
		Projector projector = new Projector(dvdplayer);
		TheaterLights theaterlights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popcornpopper = new PopcornPopper();
		
		HomeTheaterFacade htf = new HomeTheaterFacade(amplifier, 
														tuner, 
														dvdplayer, 
														cdplayer, 
														projector, 
														theaterlights, 
														screen, 
														popcornpopper);
		
		htf.listenToCd();
	}

}
