package structural.adapter.duckturkey;

public class MallardDuck implements IDuck {

	@Override
	public String quack() {
		return "Quack";
	}

	@Override
	public String fly() {
		return "I'm flying";
	}
	
}
