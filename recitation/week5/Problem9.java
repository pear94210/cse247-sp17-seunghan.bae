package week5;

public class Problem9 {

	/*
	 * Given an infinite number of quarters, dimes, nickels,and pennies,
	 * write code to calculate the number of ways of representing n cents.
	 */
	
	public static void main(String[] args) {
		System.out.println(countWays(100));
		System.out.println(countWays(5));
		System.out.println(countWays(1));
		
	}

	public static int countWays(int money) {
		int[] coins = {25, 10, 5, 1};
		return countWays(money, coins, 0);
	}
	
	public static int countWays(int money, int[] coins, int index) {
		if (index >= coins.length - 1) return 1;
		int coin = coins[index];
		int ways = 0;
		for (int i = 0; i * coin <= money; i++) {
			int remainder = money - (i * coin);
			ways += countWays(remainder, coins, index + 1);
		}
		return ways;
	}
	
}
