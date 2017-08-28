package structural.adapter.duckturkey;

public class TurkeyAdapter implements IDuck {
	ITurkey iturkey;
	
	public TurkeyAdapter(ITurkey iturkey) {
		this.iturkey = iturkey;
	}
	
	public String quack(){
		return iturkey.gobble();
	}
	
	public String fly(){
		return iturkey.fly();
	}
}
