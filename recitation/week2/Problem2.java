package week2;

public class Problem2 {
	
	// Problem 3-4 (p62)

	/* (a) NO: f(n) = n, g(n) = n^2
	 */
	
	/* (b) NO: f(n) = n, g(n) = n^2
	 */
	
	/* (c) lg = log of base 2
	 *     => 2^lg(f(n)) = f(n) <= cg(n) = c*2^lg(g(n))
	 *     => 2^lg(f(n)) = O(2^lg(g(n)))
	 *     => lg(f(n)) = O(lg(g(n)))
	 *     
	 *     or
	 *     
	 *     => lg(f(n)) <= lg(cg(n)) = lg(c) + lg(g(n) <= lg(c)lg(g(n)) + lg(g(n)) = (lg(c) + 1)lg(g(n)) = dlg(g(n))
	 *     => lg(f(n)) = O(lg(g(n))
	 */
	
	/* (d) NO: f(n) = 2n, g(n) = n
	 */
	
	/* (e) NO: f(n) = 1/n
	 */
	
	/* (f) f(n) <= cg(n) for n >= n_0
	 *     => g(n) >= (1/c)f(n) = df(n) for n >= n_0
	 *     => g(n) = OMEGA(f(n))
	 */
	
	/* (g) NO: f(n) = e^(1/n)
	 */
	
	/* (h) f(n) + o(f(n)) >= f(n) => OMEGA(f(n))
	 *     f(n) + o(f(n)) <= f(n) + cf(n) = (c+1)f(n) = df(n) => O(f(n))
	 *     => f(n) + o(f(n)) = THETA(f(n))
	 */
}
