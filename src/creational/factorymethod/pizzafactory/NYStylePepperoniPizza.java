package creational.factorymethod.pizzafactory;

public class NYStylePepperoniPizza extends AbstractPizza {

	public NYStylePepperoniPizza() {
		super.name = "NY Style Pepperoni Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";
		super.toppings.add("Grated Reggiano Cheese");
		super.toppings.add("Sliced Pepperoni");
		super.toppings.add("Garlic");
		super.toppings.add("Onion");
		super.toppings.add("Mushrooms");
		super.toppings.add("Red Pepper");
	}
	
}
