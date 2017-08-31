package behavioural.iterator.maplist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
		/*
		 * Both concrete FlowerIterator and AnimalIterator classes 
		 * implement hasNext() and next() methods mandated by the 
		 * IIterator interface. The IContainer interface ensures
		 * that the createIterator() method is implemented by the 
		 * concrete ContainerList and ContainerMap classes, and will 
		 * return an IIterator object.
		 * 
		 * Outputs:
		 * cat
		 * dog
		 * Rose
		 * Daisy
		 */
		List<String> animals = Arrays.asList("cat", "dog");
		IContainer<String> animalContainer = new ContainerList<String>(animals);
		IIterator<String> animalIterator = animalContainer.createIterator();
		
		while(animalIterator.hasNext())
			System.out.println(animalIterator.next());
		
		Map<Integer, String> flowers = new HashMap<Integer, String>();
		flowers.put(0, "Rose");
		flowers.put(1, "Daisy");
		IContainer<String> flowerContainer = new ContainerHashMap<Integer, String>(flowers);
		IIterator<String> flowerIterator = flowerContainer.createIterator();
		
		while(flowerIterator.hasNext())
			System.out.println(flowerIterator.next());
	}

}
