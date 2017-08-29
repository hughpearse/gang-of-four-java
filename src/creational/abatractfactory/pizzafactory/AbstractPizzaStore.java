package creational.abatractfactory.pizzafactory;

public abstract class AbstractPizzaStore {
	
	abstract AbstractPizza createPizza(String type);
	
	public final AbstractPizza orderPizza(String type) {
		AbstractPizza pizza = createPizza(type);
		System.out.println("Making a " + pizza.getName());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
