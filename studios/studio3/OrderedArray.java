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
		return this.size == 0;
	}

	@Override
	public void insert(T thing) {
		int index = 0;
//		while (index < this.size && this.array[index].compareTo(thing) < 0) {
//			index++;
//		}
		for (int i = 0; i < this.size; i++) {
			if (thing.compareTo(this.array[i]) > 0) index = i + 1;
		}
 		for (int j = this.size - 1; j >= index; j--) {
 			this.array[j + 1] = this.array[j];
		}
 		this.array[index] = thing;
		this.size++;
  	}
	
	@Override
	public T extractMin() {
		T min = this.array[0];
		for (int i = 1; i < this.size; i++) {
			this.array[i - 1] = this.array[i];
		}
		this.size--;
		return min;
	}

}
