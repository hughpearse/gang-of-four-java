package behavioural.iterator.maplist;

import java.util.Map;

public class IteratorMap <X,Y> implements IIterator<Y> {
	private int position = 0;
	private Map<X,Y> map;
	
	public IteratorMap(Map<X, Y> map) {
		this.map = map;
	}

	@Override
	public boolean hasNext() {
		try { 
			map.get(map.keySet().toArray()[position]);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Y next() {
		return map.get(map.keySet().toArray()[position++]);
	}

}
