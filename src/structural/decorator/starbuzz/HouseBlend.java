package structural.decorator.starbuzz;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		super("House Blend");
	}

	@Override
	public double cost() {
		return 0.89d;
	}

}
