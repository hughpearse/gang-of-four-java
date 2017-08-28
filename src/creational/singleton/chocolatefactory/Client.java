package creational.singleton.chocolatefactory;

public class Client extends Thread{
	ChocolateBoiler boiler = ChocolateBoiler.getInstance();
	
	public void run() {
		printState("new");
		boiler.fill();
		printState("filled");
		boiler.boil();
		printState("boiled");
	}
	
	public synchronized void printState(String state){
		System.out.println(state + " Boiler " + Thread.currentThread().getId() + "= isBoiled: " + boiler.isBoiled() + ", isEmpty: " + boiler.isEmpty());
	}

	public static void main(String[] args) {
		Client obj = new Client();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
