package creational.factorymethod.pizzafactory;

public class NYStyleCheesePizza extends AbstractPizza {

	public NYStyleCheesePizza() {
		super.name = "NY Style Sauce and Cheese Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";
		super.toppings.add("Grated Reggiano Cheese");
	}
	
}
