package behavioural.command.simple;

public class OffCommand implements ICommand {

	Receiver receiver;
	
	public OffCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.off();
	}

}
