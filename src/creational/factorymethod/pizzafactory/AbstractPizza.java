package creational.factorymethod.pizzafactory;

import java.util.ArrayList;

public abstract class AbstractPizza {
	public String name;
	public String dough;
	public String sauce;
	public ArrayList<String> toppings = new ArrayList<String>();
	
	public final void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
	
	public final void bake() {
		System.out.println("Baking for 25 minutes at 200C");
		System.out.println("Bake complete");
	}

	public final void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public final void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public final String getName() {
		return name;
	}
	
	public final  String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}
