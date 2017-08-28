package structural.adapter.enumeratorlegacy;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyCode {
	Enumeration<String> daysEnum;
	Vector<String> daysVect = new Vector<String>();

	public LegacyCode() {
		daysVect.add("Foo");
		daysVect.add("Bar");
		daysEnum = daysVect.elements();
	}
	
	public Enumeration<String> getEnum(){
		return daysEnum;
	}
	
}
