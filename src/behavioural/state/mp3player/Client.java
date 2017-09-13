package behavioural.state.mp3player;

public class Client {

	public static void main(String[] args) {

		Context context = new Context();
		StartState startState = new StartState();
		StopState stopState = new StopState();
		
		startState.doAction(context);
		stopState.doAction(context);

	}

}
