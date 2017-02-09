package studio3;

import java.util.LinkedList;
import java.util.List;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public List<T> list;
	
	public UnorderedList() {
		list = new LinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void insert(T thing) {
		list.add(thing);
	}

	@Override
	public T extractMin() {
		T min = list.get(0);
		// for (int i = 0; i < list.size(); i++) => O(n^2)
		for (T thing : list) {
			if (thing.compareTo(min) < 0) min = thing;
		}
		list.remove(min);
		return min;
	}

}
