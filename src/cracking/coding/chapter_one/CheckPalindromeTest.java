package cracking.coding.chapter_one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckPalindromeTest {

	@Test
	void testValidPalindrome() {
		assertEquals(true, CheckPalindrome.validPalindrome("lol"));
		assertEquals(true, CheckPalindrome.validPalindrome("civic"));
		assertEquals(true, CheckPalindrome.validPalindrome("racecar"));
		assertEquals(true, CheckPalindrome.validPalindrome("rotator"));
		assertEquals(false, CheckPalindrome.validPalindrome("dogs"));
		assertEquals(false, CheckPalindrome.validPalindrome("longer"));
		assertEquals(false, CheckPalindrome.validPalindrome("not"));
		assertEquals(false, CheckPalindrome.validPalindrome("alphabet"));
	}

}
