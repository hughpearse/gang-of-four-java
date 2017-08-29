package creational.abatractfactory.pizzafactory;

public class VeggiePizza extends AbstractPizza {
	
	IPizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(IPizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name + ":");
		super.dough = ingredientFactory.createDough();
		super.sauce = ingredientFactory.createSauce();
		super.cheese = ingredientFactory.createCheese();
		super.veggies = ingredientFactory.createVeggies();
		System.out.println(super.toString());
	}
}
