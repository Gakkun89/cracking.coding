package cracking.coding.chapter_one;

public class CheckUniqueString {
	public static Boolean unique(String text) {
		boolean[] charPresentArray = new boolean[128];
		for(int i = 0; i < text.length(); i++) {
			int ascii = (int) text.charAt(i);
			if (charPresentArray[ascii]) {
				return false;
			}
			charPresentArray[ascii] = true;
		}
		return true;
	}
}
