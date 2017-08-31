package behavioural.iterator.maplist;

import java.util.Map;

public class ContainerHashMap <X,Y> implements IContainer<Y> {
	private Map<X, Y> map;

	public ContainerHashMap(Map<X,Y> map) {
		this.map = map;
	}

	@Override
	public IIterator<Y> createIterator() {
		return new IteratorMap<X, Y>(map);
	}
	
}
