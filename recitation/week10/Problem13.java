package week10;

public class Problem13 {

	/*
	 * In order to avoid false positives, consider computing multiple hashes of the sliding
	 * - window and checking the resulting values. Instead of just repeatedly multiplying by 31,
	 *   consider doing another computation that multiplies by 7, 127, etc.
	 * 
	 * How does this change the complexity of the Rabin-Karp algorithm?
	 * - using three different multipliers will result in a more complex algorithm.
	 * 
	 * How does this affect the number of false positives?
	 * - since we are making the hash more variable, there is lower possibility of false positives.
	 * 
	 * How would you eliminate all false positives?
	 * - it is impossible to eliminate "all" false positives.
	 * 
	 * How would you compute a more effective hash knowing the alphabet is only A-Z?
	 * - substitute 511 with a bigger integer so that the number of remainders increase.
	 */
	
}
