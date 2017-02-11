package week4;

public class Problem7 {
	
	/*
	 * In lecture, the analysis of heapify was based on the subproblem size of 2n/3; 
	 * but Dr. Cytron alleged that even if the subproblem size was smaller, say n/2, 
	 * you would still reach a logarithmic complexity result for heapify. Prove this is true.
	 * 
	 * => T(n) = T(n/2) + k
	 *         = T(n/4) + k + k
	 *         = ... = lg(n)*k = O(lg(n))
	 * 
	 * Prove by induction that if you have a complete tree of height k, 
	 * that the tree has a total of (2^k)-1 internal nodes.
	 * (Internal nodes excludes leafs, this means internal nodes have at least one child).
	 * 
	 * => h = 0 : 0
	 *    h = 1 : 1
	 *    assume true for h <= n
	 *    h = n + 1 : (2^n)-1 + 2^n = 2*(2^n)-1 = (2^n+1)-1
	 * 
	 * Prove that all but one square of an n x n chessboard be covered by L-Shaped trominoes 
	 * if n is a power of two (ex. 8 x 8).
	 * 
	 * => (2^k) * (2^k) = 2^2k = 4^k = (3+1)^k = SUM(kCi*(3^i)*(1^k-i)) = 1 + 3(...)
	 */
}
