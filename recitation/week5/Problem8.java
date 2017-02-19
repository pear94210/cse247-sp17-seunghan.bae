package week5;

public class Problem8 {

	/*
	 * Problem 4.3-1 (p87)
	 * T(n) = T(n-1) + n <= c(n-1)^2 + n = cn^2 - 2cn + c + n
	 *      = cn^2 - (2c-1)n + c <= cn^2 + c <= 2cn^2 = O(n^2)
	 * 
	 * Problem 4.3-2 (p87)
	 * T(n) = T(n/2) + 1 <= clg(n/2) + 1 = c(lgn-lg2) + 1 = clgn - c + 1 <= clgn = O(lgn)
	 * 
	 * Problem 4.3-3 (p87)
	 * T(n) = 2T(n/2) + n >= 2c(n/2)lg(n/2) + n = cnlg(n/2) + n
	 *      >= cnlg(n/2) = cn(lgn-lg2) = cnlgn - cn >= (1/2)cnlgn = OMEGA(nlgn)
	 * => Since T(n) = O(nlgn) and T(n) = OMEGA(nlgn), T(n) = THETA(nlgn)
	 * 
	 * Problem 4.3-5 (p87)
	 * Merge Sort: T(n) = 2T(n/2) + cn
	 * => T(n) <= 2c(n/2)lg(n/2) + cn = cn(lgn-lg2) + cn = cnlgn - cn + cn = cnlgn = O(nlgn)
	 * => T(n) >= 2c(n/2)lg(n/2) + cn = cn(lgn-lg2) + cn = cnlgn - cn + cn = cnlgn = OMEGA(nlgn)
	 * => T(n) = THETA(n)
	 */
	
}
