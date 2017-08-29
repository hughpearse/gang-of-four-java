package creational.abatractfactory.pizzafactory;

public class CheesePizza extends AbstractPizza {
	
	IPizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(IPizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name + ":");
		super.dough = ingredientFactory.createDough();
		super.sauce = ingredientFactory.createSauce();
		super.cheese = ingredientFactory.createCheese();
		System.out.println(super.toString());
	}
}
