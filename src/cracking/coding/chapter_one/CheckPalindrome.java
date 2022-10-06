package cracking.coding.chapter_one;

public class CheckPalindrome {
	public static boolean validPalindrome(String text) {
		for(int front = 0, back = text.length() - 1; front < text.length() / 2; front++, back--) {
			if(text.charAt(front) != text.charAt(back)) {
				return false;
			}
		}
		return true;
	}
}
