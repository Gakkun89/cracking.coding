package cracking.coding.chapter_one;
// full loop
public class ReverseString {
	public static String reverse(String text) {
		if (text == null) {throw new RuntimeException("text is not initialized");}
		char[] chars = text.toCharArray();
		char[] reversed = new char[chars.length];
		for(int i = text.length() - 1, n = 0; i >= 0; i --, n ++) {
			reversed[n] = chars[i];
		}
		return String.valueOf(reversed);
	}
}
// half loop
//public class ReverseString {
//	public static String reverse(String text) {
//		char[] chars = text.toCharArray();
//		final int charsLength = chars.length;
//		char temp;
//		for(int i = 0; i < charsLength/2; i ++) {
//			temp= chars[i];
//			System.out.println(temp);
//			chars[i] = chars[charsLength - 1 - i];
//			System.out.println(chars);
//			chars[charsLength - 1 - i] = temp;
//		}
//		return String.valueOf(chars);
//	}
//}