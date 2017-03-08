package kwaymergesort;

import timing.Ticker;

public class KWayMergeSort {
	
	/**
	 * 
	 * @param K some positive power of 2.
	 * @param input an array of unsorted integers.  Its size is either 1, or some other power of 2 that is at least K
	 * @param ticker call .tick() on this to account for the work you do
	 * @return
	 */
	public static Integer[] kwaymergesort(int K, Integer[] input, Ticker ticker) {
		int n = input.length;
		
		//
		// FIXME
		// Following just copies the input as the answer
		//
		// You must replace the loop below with code that performs
		// a K-way merge sort, placing the result in ans
		//
		// The web page for this assignment provides more detail.
		//
		// Use the ticker as you normally would, to account for
		// the operations taken to perform the K-way merge sort.
		//
		Integer[] ans = new Integer[n];
		
		if (input.length == 1) {
			ans[0] = input[0];
			ticker.tick();
			
			return ans;
		} else {
			Integer[][] newInput = new Integer[K][input.length / K];
			Integer[][] newAns = new Integer[K][input.length / K];
			
			for (int r = 0; r < K; r++) {
				for (int c = 0; c < input.length / K; c++) {
					newInput[r][c] = input[(r * (input.length / K)) + c];
					ticker.tick();
				}
				newAns[r] = kwaymergesort(K, newInput[r], ticker);
			}
			
			// FIXME: merge K arrays into one
			
			return ans;
		}
	}

}
