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
			ticker.tick(input.length);
			
			for (int r = 0; r < K; r++) {
				for (int c = 0; c < input.length / K; c++) {
					newInput[r][c] = input[(r * (input.length / K)) + c];
					ticker.tick();
				}
				newAns[r] = kwaymergesort(K, newInput[r], ticker);
				ticker.tick();
			}
			
			ans = mergeArrays(newAns, ticker)[0];
			
			return ans;
		}
	}
	
	static Integer[][] mergeArrays(Integer[][] array, Ticker ticker) {
		if (array.length == 1) {
			ticker.tick();
			return array;
		}
		else {
			Integer[][] ans = new Integer[array.length / 2][array[0].length * 2];
			ticker.tick(ans.length * ans[0].length);
			
			for (int r = 0; r < ans.length; r++) {
				int countA = 0;
				int countB = 0;
				
				for (int c = 0; c < ans[r].length; c++) {
					if (array[2 * r][countA] <= array[(2 * r) + 1][countB]) {
						ans[r][c] = array[2 * r][countA];
						if (countA < array[2 * r].length - 1) {
							countA++;
							ticker.tick();
						} else {
							array[2 * r][countA] = Integer.MAX_VALUE;
							ticker.tick();
						}
					} else {
						ans[r][c] = array[(2 * r) + 1][countB];
						if (countB < array[(2 * r) + 1].length - 1) {
							countB++;
							ticker.tick();
						} else {
							array[(2 * r) + 1][countB] = Integer.MAX_VALUE;
							ticker.tick();
						}
					}
				}
			}
			
			return mergeArrays(ans, ticker);
		}
	}

}
