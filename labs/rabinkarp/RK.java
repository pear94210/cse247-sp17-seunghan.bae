package rabinkarp;

public class RK {
	
	//
	// Be sure to look at the write up for this assignment
	//  so that you get full credit by satisfying all
	//  of its requirements
	//
	private char[] array;
	private int hash;
	private int power;
	private int pointer;

	/**
	 * Rabin-Karp string matching for a window of the specified size
	 * @param m size of the window
	 */
	public RK(int m) {
		this.array = new char[m];
		this.hash = 0;
		this.power = 1;
		for (int i = 0; i < m; i++) this.power = (this.power * 31) % 511;
		this.pointer = 0;
	}
	
	/**
	 * Compute the rolling hash for the previous m-1 characters with d appended.
	 * @param d the next character in the target string
	 * @return
	 */
	public int nextCh(char d) {
		int c = (int)this.array[this.pointer];
		this.array[this.pointer] = d;
		
		if (this.pointer == this.array.length - 1) this.pointer = 0;
		else this.pointer++;
		
		int hash1 = this.hash * 31;
		int hash2 = (this.power * c) % 511;
		this.hash = ((hash1 + (int)d) - (hash2 % 511)) % 511;
		if (this.hash < 0) hash += 511;
				
		return this.hash;
	}

}
