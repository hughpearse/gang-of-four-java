package structural.adapter.enumeratorlegacy;

import java.util.Enumeration;

public class Client {

	public static void main(String[] args) {
		
		/*
		 * Description:
		 * can now remove elements from legacy Enumeration
		 * 
		 * output:
		 * Legacy: Foo
		 * Legacy: Bar
		 * Retrofitted: Foo
		 */
		LegacyCode lc1 = new LegacyCode();
		Enumeration<String> var1 = lc1.getEnum();
		while(var1.hasMoreElements()) {
			System.out.println("Legacy: " + var1.nextElement().toString());
		}
		
		LegacyCode lc2 = new LegacyCode();
		Enumeration<String> var2 = lc2.getEnum();
		EnumerationIterator ei = new EnumerationIterator(lc2.getEnum());
		ei.remove("Bar");
		while(ei.hasNext()) {
			System.out.println("Retrofitted: " + ei.next().toString());
		}
	}

}
