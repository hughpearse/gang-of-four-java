package creational.abatractfactory.pizzafactory;

public class Client {

	public static void main(String[] args) {
		/*
		 * Description:
		 * Notice how AbstractPizzaStore.orderPizza() and  AbstractPizza.prepare()
		 * are both final, this will guarantee that their implementation follows a specification
		 * even though the classes are extended.
		 * also
		 * Notice how IPizzaIngredientFactory is an interface with methods that return more interfaces.
		 * These returned interfaces are not concrete
		 * 
		 * Output:
		 * Making a New York Style Veggie Pizza
		 * Preparing New York Style Veggie Pizza:
		 *   Thin Crust Dough
		 *   Marinara Sauce
		 *   Reggiano Cheese
		 *   Garlic, Onion, Mushroom, Red Pepper
		 * Baking for 25 minutes at 200C
		 * Bake complete
		 * Cutting the pizza into diagonal slices
		 * Place pizza in official PizzaStore box
		 * Ethan ordered a New York Style Veggie Pizza
		 */
		
		AbstractPizzaStore nyStore = new NYPizzaStore();
		AbstractPizza pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	}

}
