package structural.decorator.starbuzz;

public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		super(beverage.getDescription() + ", Steamed Milk");
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return 0.10d + beverage.cost();
	}

}
