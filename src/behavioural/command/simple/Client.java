package behavioural.command.simple;

public class Client {

	public static void main(String[] args) {
		/*
		 * Description
		 * The remote/invoker is given a command object
		 * The command object is given a receiver/device
		 * Each concrete command changes the receiver/device state
		 * 
		 * Output:
		 * Light is on
		 * Light is off
		 */
		Invoker invoker = new Invoker();
		Receiver light = new Receiver();
		OnCommand lightOn = new OnCommand(light);
		OffCommand lightOff = new OffCommand(light);
		
		invoker.setCommand(lightOn);
		invoker.pressButton();
		invoker.setCommand(lightOff);
		invoker.pressButton();
	}

}
