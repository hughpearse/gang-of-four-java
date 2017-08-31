package behavioural.templatemethod.barista;

public class Client {

	public static void main(String[] args) {
		
		/*
		 * Description
		 * Some methods are abstract other are not.
		 * 
		 * output:
		 * Making coffee...
		 * Boiling water
		 * Dripping Coffee through filter
		 * Pouring into cup
		 * Adding Sugar and Milk
		 * 
		 * Making hooked coffee...
		 * Boiling water
		 * Dripping Coffee through filter
		 * Pouring into cup
		 * Would you like milk and sugar with your coffee (y/n)? y
		 * Adding Sugar and Milk
		 */
		Coffee coffee = new Coffee();
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
		
		CoffeeHook coffeeHook = new CoffeeHook();
		System.out.println("\nMaking hooked coffee...");
		coffeeHook.prepareRecipe();

	}

}
