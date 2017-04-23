package week12;

public class Problem16 {
	
	public static void main(String[] args) {
		caesarText("Hel1o", 25);
		caesarText("Bv4", 4);
		caesarText("HLA RMA 7", 17);
	}
	
	public static void caesarText(String s, int n) {
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				ans += (char)(((c - 'a') + n) % 26 + 'a');
			} else if (c >= 'A' && c <= 'Z') {
				ans += (char)(((c - 'A') + n) % 26 + 'A');
			} else ans += c;
		}
		
		System.out.println("Text: " + s);
		System.out.println("Shift: " + n);
		System.out.println("Cipher: " + ans);
		System.out.println();
	}
	
}
