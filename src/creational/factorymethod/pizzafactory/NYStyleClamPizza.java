package creational.factorymethod.pizzafactory;

public class NYStyleClamPizza extends AbstractPizza {

	public NYStyleClamPizza() {
		super.name = "NY Style Clam Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";
		super.toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
	
}
