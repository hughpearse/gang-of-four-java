package structural.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	public CondimentDecorator(String description) {
		super(description);
	}

	public abstract String getDescription();
}
