package creational.abatractfactory.pizzafactory;

public class PepperoniPizza extends AbstractPizza {
	
	IPizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(IPizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name + ":");
		super.dough = ingredientFactory.createDough();
		super.sauce = ingredientFactory.createSauce();
		super.cheese = ingredientFactory.createCheese();
		super.veggies = ingredientFactory.createVeggies();
		super.pepperoni = ingredientFactory.createPepperoni();
		System.out.println(super.toString());
	}
}
