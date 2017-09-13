package behavioural.state.mp3player;

public class StopState implements IState {
	
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	
	public String toString(){
		return "Stop State";
	}
}
