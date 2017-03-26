package week9;

public class Problem11 {

	/*
	 * Problem 11.2-3
	 * 
	 * Professor Marley hypothesizes that he can obtain substantial performance gains
	 * by modifying the chaining scheme to keep each list in sorted order.
	 * How does the professor¡¯s modification affect the running time for successful searches,
	 * unsuccessful searches, insertions, and deletions? 
	 * 
	 * Use "binary search" - THETA(logn)
	 * - successful searches: THETA(logn)
	 * - unsuccessful searches: THETA(logn)
	 * - insertions: THETA(n)
	 * - deletions: THETA(n)
	 * 
	 * What are the two rules of int hashCode()?
	 * 
	 * 1) no two objects that are different may have the same hashcode
	 * 2) two objects that are identical should have the same hashcode
	 * 
	 * What is the worst-case time complexity of fetching an object from a hash table
	 * that resolves collisions with chaining? Why?
	 * 
	 * THETA(n)
	 * => all the objects in one bucket, and the object we want in the middle of the list
	 * 
	 * How do you measure the effectiveness of a hashCode() function?
	 * 
	 * - Do different objects have different hashcodes?
	 * - Do same objects have same hashcodes?
	 * - Are objects dispersed evenly among buckets?
	 * 
	 * How does the hashcode for set differ from the hashcode for list?
	 * 
	 * set: order does not matter; value matters => same values, same hashcode
	 * list: order matters => with same values ordered differently, different hashcode
	 */
	
}
