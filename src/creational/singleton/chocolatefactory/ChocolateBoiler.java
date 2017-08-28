package creational.singleton.chocolatefactory;

public class ChocolateBoiler {
	//volatile guarantees visibility of changes to variables across threads
	//eager initialization for better thread safety
	private volatile static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
	private volatile static boolean empty = true;
	private volatile static boolean boiled = false;
	
	private ChocolateBoiler() {}
	
	public static ChocolateBoiler getInstance() {
		return uniqueInstance;
	}
	
	public void fill() {
		if (isEmpty()) {
			synchronized(uniqueInstance){
				if (isEmpty()) {
					ChocolateBoiler.empty = false;
					ChocolateBoiler.boiled = false;
				}
			}
		}
	}
	
	public void drain(){
		if (!isEmpty() && isBoiled()) {
			synchronized(uniqueInstance){
				if (!isEmpty() && isBoiled()) {
					ChocolateBoiler.empty = true;
				}
			}
		}
	}
	
	public void boil(){
		if (!isEmpty() && !isBoiled()) {
			synchronized(uniqueInstance){
				if (!isEmpty() && !isBoiled()) {
					ChocolateBoiler.boiled = true;
				}
			}
		}
	}
	
	public boolean isEmpty() {
			return ChocolateBoiler.empty;
	}
	
	public boolean isBoiled() {
			return ChocolateBoiler.boiled;
	}
	
	public synchronized String toString() {
		return "= isBoiled: " + isBoiled() + ", isEmpty: " + isEmpty();
	}
}