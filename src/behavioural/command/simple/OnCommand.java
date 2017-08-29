package behavioural.command.simple;

public class OnCommand implements ICommand {

	Receiver receiver;

	public OnCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.on();
	}

}
