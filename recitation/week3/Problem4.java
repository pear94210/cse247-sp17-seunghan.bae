package week3;

public class Problem4 {
	
	public void makeAnArray(int n) {
		int[] arr = new int[n];
	}
	// runtime = O(1)
	
	public void printFirstItemThenFirstHalfThenSayHi100Times(int[] theArray) {
		System.out.println(theArray[0]);
		
		int middleIndex = theArray.length / 2;
		int index = 0;
		
		while (index < middleIndex) {
			System.out.println(theArray[index]);
			index++;
		}
		
		for (int x = 0; x < 100; x++) {
			System.out.println("hi");
		}
	}
	// runtime = 1 + 2 + (1/2)n + 100 = O(n)
	    
}
