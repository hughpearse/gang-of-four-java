package creational.abatractfactory.pizzafactory;

public interface IPizzaIngredientFactory {
	public IDough createDough();
	public ISauce createSauce();
	public ICheese createCheese();
	public IVeggies[] createVeggies();
	public IPepperoni createPepperoni();
	public IClams createClam();
}
