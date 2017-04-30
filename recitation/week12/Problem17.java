package week12;

public class Problem17 {

	public static void main(String[] args) {
		computeMod(5, 4, 5);
		computeMod(3, 3, 2);
		computeMod(4, 3, 7);
		computeMod(1731, 2190, 2183);
		computeA(665, 1731, 2183);
	}
	
	public static void computeMod(int a, int y, int p) {
		int ans = 1;
		
		for (int i = 0; i < y; i++) {
			ans *= a;
			ans %= p;
		}
		
		System.out.println(a + "^" + y + " mod " + p + " = " + ans);
	}
	
	public static void computeA(int mod, int g, int p) {
		int ans = 0;
		int interval = 0;
		int modTemp = 1;
		int temp = 1;
		
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			modTemp *= g;
			modTemp %= p;
			if (modTemp == mod) {
				ans = i + 1;
				break;
			}
		}
		
		for (int j = 0; j < Integer.MAX_VALUE; j++) {
			temp *= g;
			temp %= p;
			if (temp == 1) {
				interval = j + 1;
				break;
			}
		}
		
		System.out.println(g + "^a mod " + p + " = " + mod + " => a = " + ans + " + " + interval + "k");
	}
}
