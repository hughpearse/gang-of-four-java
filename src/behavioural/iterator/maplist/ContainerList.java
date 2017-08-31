package behavioural.iterator.maplist;

import java.util.List;

public class ContainerList <Y> implements IContainer<Y> {
	private List<Y> list;

	public ContainerList(List<Y> list) {
		this.list = list;
	}

	@Override
	public IIterator<Y> createIterator() {
		return new IteratorList<Y>(list);
	}
	
}
