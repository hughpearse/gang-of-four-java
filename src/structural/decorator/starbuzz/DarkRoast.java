package structural.decorator.starbuzz;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		super("Dark Roast");
	}

	@Override
	public double cost() {
		return 0.99d;
	}

}
