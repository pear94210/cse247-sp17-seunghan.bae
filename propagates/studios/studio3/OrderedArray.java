package studio3;

public class OrderedArray<T extends Comparable<T>> implements PriorityQueue<T> {

	public T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
	public OrderedArray(int maxSize) {
		array = (T[]) new Comparable[maxSize];
		size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		if (this.size != 0) return false;
		else return true;
	}

	@Override
	public void insert(T thing) {
		
		int store = 0;
		
		for (int i = 0; i < this.size; i++) {
			if (thing.compareTo(array[i]) > 0) {
				store = i;
				break;
			}
		}

		for (int i = store+1; i < this.size; i++) {
			array[i+1] = array[i];
		}
		
		array[store] = thing;
		
	}
	
	@Override
	public T extractMin() {
		
		for (int i = 0; i < this.size; i++) {
			this.array[i-1] = this.array[i];
		}
		size--;
		return this.array[0];

}
}
