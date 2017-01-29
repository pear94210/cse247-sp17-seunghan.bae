package week2;

public class Problem2 {

	/*
	 * (a) NO: f(n) = n, g(n) = n^2
	 */
	
	/*
	 * (b) NO: f(n) = n, g(n) = n^2
	 */
	
	/*
	 * (c) 
	 */
	
	/*
	 * (d) log(2^f(n)) = f(n) <= cg(n) = clog(2^g(n)) for n >= n_0
	 *     => log(2^f(n)) = O(log(2^g(n)))
	 *     => 2^f(n) = O(2^g(n))
	 */
	
	/*
	 * (e) NO: f(n) = 1/n
	 */
	
	/*
	 * (f) f(n) <= cg(n) for n >= n_0
	 *     => g(n) >= (1/c)f(n) = df(n) for n >= n_0
	 *     => g(n) = OMEGA(f(n))
	 */
	
	/*
	 * (g) NO: f(n) = e^(1/n)
	 */
	
	/*
	 * (h) f(n) + o(f(n)) >= f(n) => OMEGA(f(n))
	 *     f(n) + o(f(n)) <= f(n) + cf(n) = (c+1)f(n) = df(n) => O(f(n))
	 *     => f(n) + o(f(n)) = THETA(f(n))
	 */
}
