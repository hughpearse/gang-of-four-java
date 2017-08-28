package structural.decorator.starbuzz;

public class Client {

	public static void main(String[] args) {
		/*
		 * Details:
		 * abstract Beverage
		 * concrete Beverages: HouseBlend, DarkRoast, Espresso, Decaf
		 * abstract decorator CondimentDecorator
		 * concrete decorators: Mocha, Soy, SteamedMilk, Whip
		 *  
		 *  outputs:
		 *  House Blend, Soy; costs: 1.04
		 *  House Blend, Soy, Mocha, Whip; costs: 1.34
		 */
		Beverage aliceBase = new HouseBlend();
		Beverage aliceCondiment1 = new Soy(aliceBase);
		System.out.println(aliceCondiment1.getDescription() + "; costs: " + aliceCondiment1.cost());
		
		Beverage bobBase = new HouseBlend();
		Beverage bobCondiment1 = new Soy(bobBase);
		Beverage bobCondiment2 = new Mocha(bobCondiment1);
		Beverage bobCondiment3 = new Whip(bobCondiment2);
		System.out.println(bobCondiment3.getDescription() + "; costs: " + bobCondiment3.cost());
	}

}
