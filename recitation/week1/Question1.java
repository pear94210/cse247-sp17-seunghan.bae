package week1;

public class Question1 {

	/* Question 2.2-2
	 * 
	 *  for i = 1 to A.length - 1
	 * 		min = i
	 * 		for j = i + 1 to A.length
	 * 			if A[j] < A[min]
	 * 				min = j
	 * 		temp = A[i]
	 * 		A[i] = A[min]
	 * 		A[min] = temp
	 * 
	 * Outer loop : A[1] ~ A[i-1] smallest (i-1) nums, nondecreasing order
	 * Inner loop : A[min] be smallest among A[i] ~ A[j-1]
	 * 
	 * Need to compare two entries (i and j), but if i = n then there is no j to compare (i be the largest #, redundant process)
	 * 
	 * Best case (OMEGA(n^2)) : (n-1)(1+
	 * Worst case (O(n^2)) : (n-1)(1+
	 * THETA(n^2)
	 * 
	 * http://clrs.skanev.com/02/02/02.html
	 */
		
	public static void main(String[] args) {
		int[] A = {2, 7, 4, 3, 1, 5, 6, 0};
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		int[] B = switchArray(A);
		
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
	}
	
	public static int[] switchArray(int[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			int loc = i;
			
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[loc]) {
					loc = j;
				}
			}
			
			int temp = A[i];
			A[i] = A[loc];
			A[loc] = temp;
		}
		
		return A;
	}

}
