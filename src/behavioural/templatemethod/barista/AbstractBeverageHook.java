package behavioural.templatemethod.barista;

public abstract class AbstractBeverageHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	//method which allows subclass to override algorithm in the middle - aka our hook
	boolean customerWantsCondiments() {
		return true;
	}
}
