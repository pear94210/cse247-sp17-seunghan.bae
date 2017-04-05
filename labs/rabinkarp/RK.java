package rabinkarp;

public class RK {
	
	//
	// Be sure to look at the write up for this assignment
	//  so that you get full credit by satisfying all
	//  of its requirements
	//
	char[] array;
	int hash;
	int power;

	/**
	 * Rabin-Karp string matching for a window of the specified size
	 * @param m size of the window
	 */
	public RK(int m) {
		array = new char[m];
		hash = 0;
		power = 1;
		for (int i = 0; i < m; i++) power = (power * 31) % 511;
	}
	

	/**
	 * Compute the rolling hash for the previous m-1 characters with d appended.
	 * @param d the next character in the target string
	 * @return
	 */
	public int nextCh(char d) {
		int temp = (int)array[0];
		for (int i = 0; i < array.length - 1; i++) array[i] = array[i + 1];
		array[array.length - 1] = d;
		
		int hash1 = hash * 31;
		int hash2 = (power * temp) % 511;
		
		hash = ((hash1 + (int)d) - (hash2 % 511)) % 511;
		if (hash < 0) hash += 511;
				
		return hash;
	}

}
