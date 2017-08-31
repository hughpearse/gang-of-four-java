package behavioural.iterator.maplist;

import java.util.List;

public class IteratorList<Y> implements IIterator<Y> {
	Integer position = 0;
	List<Y> map;
	
	public IteratorList(List<Y> map) {
		this.map = map;
	}

	@Override
	public boolean hasNext() {
		if (position < map.size())
			return true;
		else
			return false;
	}

	@Override
	public Y next() {
		return map.get(position++);
	}

}
