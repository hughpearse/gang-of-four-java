package behavioural.state.mp3player;

public class Context {
	private IState istate = null;
	
	public void setState(IState istate){
		this.istate = istate;
	}
	
	public IState getState(){
		return istate;
	}
}
