package creational.factorymethod.pizzafactory;

public class Client {

	public static void main(String[] args) {
		/*
		 * Description:
		 * Notice how AbstractPizzaStore.orderPizza() and  AbstractPizza.prepare()
		 * are both final, this will guarantee that their implementation follows a specification
		 * even though the classes are extended.
		 * 
		 * Output:
		 * Making a NY Style Veggie Pizza
		 * Preparing NY Style Veggie Pizza
		 * Tossing dough...
		 * Adding sauce...
		 * Adding toppings: 
		 *    Grated Reggiano Cheese
		 *       Sliced Pepperoni
		 *       Garlic
		 *       Onion
		 *       Mushrooms
		 *       Red Pepper
		 * Baking for 25 minutes at 200C
		 * Bake complete
		 * Cutting the pizza into diagonal slices
		 * Place pizza in official PizzaStore box
		 * Ethan ordered a NY Style Veggie Pizza
		 */
		
		AbstractPizzaStore nyStore = new NYPizzaStore();
		AbstractPizza pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	}

}
