package creational.abatractfactory.pizzafactory;

public abstract class AbstractPizza {
	public String name;
	public IDough dough;
	public ISauce sauce;
	public IVeggies veggies[];
	public ICheese cheese;
	public IPepperoni pepperoni;
	public IClams clam;
	
	abstract void prepare();
	
	void setName(String name) {
		this.name = name;
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
		if (dough != null)
			display.append("  " + dough + "\n");
		if (sauce != null)
			display.append("  " + sauce + "\n");
		if (cheese != null)
			display.append("  " + cheese + "\n  ");
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				display.append(veggies[i]);
				if (i < veggies.length-1) {
					display.append(", ");
				}
			}
		}
		if (clam != null)
			display.append(clam + "\n");
		if (pepperoni != null)
			display.append(pepperoni + "\n");
		return display.toString();
	}
}
