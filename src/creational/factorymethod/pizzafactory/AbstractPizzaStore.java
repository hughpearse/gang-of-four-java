package creational.factorymethod.pizzafactory;

public abstract class AbstractPizzaStore {
	
	abstract AbstractPizza createPizza(String s);
	
	public final AbstractPizza orderPizza(String s) {
		AbstractPizza pizza = createPizza(s);
		System.out.println("Making a " + pizza.getName());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
