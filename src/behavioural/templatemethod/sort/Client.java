package behavioural.templatemethod.sort;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		/*
		 * Description:
		 * compareTo() method is overridden for duck.weight
		 * 
		 * Output:
		 * Daffy weighs 8
		 * Donald weighs 10
		 * Huey weighs 2
		 * Huey weighs 2
		 * Daffy weighs 8
		 * Donald weighs 10
		 */
		Duck[] ducks = {
				new Duck("Daffy", 8),
				new Duck("Donald", 10),
				new Duck("Huey", 2)
		};
		
		for (Duck d : ducks)
			System.out.println(d);
		
		Arrays.sort(ducks);
		
		for (Duck d : ducks)
			System.out.println(d);
	}

}
