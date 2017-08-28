package structural.adapter.enumeratorlegacy;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIterator implements Iterator<String> {
	Enumeration<String> myEnum;

	public EnumerationIterator(Enumeration<String> myEnum) {
		this.myEnum = myEnum;
	}
	
	@Override
	public boolean hasNext() {
		return myEnum.hasMoreElements();
	}

	@Override
	public String next() {
		return myEnum.nextElement();
	}
	
	public void remove(String r) {
		Vector<String> tempVect = new Vector<String>();
		
		for (String s : Collections.list(myEnum)) {
			if (s != r) {
				tempVect.add(s);
			}
		}
		myEnum = tempVect.elements();
	}
}
