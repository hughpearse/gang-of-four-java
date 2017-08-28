package structural.adapter.duckturkey;

public class WildTurkey implements ITurkey {

	@Override
	public String gobble() {
		return "Goggle gobble";
	}

	@Override
	public String fly() {
		return "I'm flying a short distance";
	}

}
