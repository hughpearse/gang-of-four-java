package structural.decorator.starbuzz;

public abstract class Beverage {
	String description = "";

	public Beverage(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
