package cracking.coding.chapter_one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckUniqueStringTest {

	@Test
	void testUnique() {
		assertEquals(true, CheckUniqueString.unique("abcd"));
		assertEquals(false, CheckUniqueString.unique("aaa"));
		assertEquals(true, CheckUniqueString.unique("the"));
		assertEquals(false, CheckUniqueString.unique("abcdefghijklmnopqrstuvwxyzz"));
	}

}
