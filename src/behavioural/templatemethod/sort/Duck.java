package behavioural.templatemethod.sort;

public class Duck implements Comparable<Duck> {

	public String name;
	public int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return this.name + " weighs " + weight;
	}
	
	@Override
	public int compareTo(Duck od) {
		if (this.weight < od.weight)
			return -1;
		else if (this.weight == od.weight)
			return 0;
		else
			return 1;
	}

}
