package week2;

public class Problem3 {

	// runtime = big O time
	
	int product(int a, int b) {
		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += a;
		}
		return sum;
	}
	// runtime = b
	
	int mod(int a, int b) {
		if (b <= 0) {
			return -1;
		}
		int div = a / b;
		return a - div * b;
	}
	// runtime = 1 (constant)
	
	int div(int a, int b) {
		int count = 0;
		int sum = b;
		while (sum <= a) {
			sum += b;
			count++;
		}
		return count;
	}
	// runtime = a / b
	
	int sumDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	// big O time = log(n)
	
}
