package creational.factorymethod.pizzafactory;

public class NYStyleVeggiePizza extends AbstractPizza {

	public NYStyleVeggiePizza() {
		super.name = "NY Style Veggie Pizza";
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
