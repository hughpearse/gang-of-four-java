package creational.abatractfactory.pizzafactory;

public class ClamPizza extends AbstractPizza {
	
	IPizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(IPizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name + ":");
		super.dough = ingredientFactory.createDough();
		super.sauce = ingredientFactory.createSauce();
		super.cheese = ingredientFactory.createCheese();
		super.clam = ingredientFactory.createClam();
		System.out.println(super.toString());
	}
}
