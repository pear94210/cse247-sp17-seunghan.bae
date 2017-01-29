package week1;

import java.util.Arrays;

public class Problem1 {

	/* 
	 * Problem 2.2-2
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
	 * Loop invariants : "how each loop leads us to the end result of the program"
	 * i-loop : A[1] ~ A[i-1] are sorted (smallest i-1 numbers, nondecreasing order)
	 * j-loop : A[min] be smallest among A[i] ~ A[j-1]
	 * 
	 * Need to compare two entries (i and j), but if i = n then there is no j to compare
	 * (i be the largest #, redundant process)
	 * 
	 * (n-1)+(n-2)+...+2+1 = n(n-1)/2 => THETA(n^2)
	 * (best and worst cases both follow same THETA)
	 * 
	 * http://clrs.skanev.com/02/02/02.html
	 */
		
	public static void main(String[] args) {
		int[] A = {8, -2, 7, -4, 3, 1, -5, 6, 0};
		
		System.out.println(Arrays.toString(A));
		
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
		
		System.out.print(Arrays.toString(A));
	}
}
