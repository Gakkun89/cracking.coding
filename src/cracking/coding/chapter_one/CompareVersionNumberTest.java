package cracking.coding.chapter_one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareVersionNumberTest {

	@Test
	void testCompareVersion() {
		assertEquals(1, CompareVersionNumber.compareVersion("10.1.15", "10.1.14"));
		assertEquals(1, CompareVersionNumber.compareVersion("10.2.15", "10.1.15"));
		assertEquals(1, CompareVersionNumber.compareVersion("11.1.15", "10.1.15"));
		assertEquals(-1, CompareVersionNumber.compareVersion("10.1.15", "10.1.16"));
		assertEquals(-1, CompareVersionNumber.compareVersion("10.2.15", "10.3.15"));
		assertEquals(-1, CompareVersionNumber.compareVersion("11.1.15", "13.1.15"));
		assertEquals(0, CompareVersionNumber.compareVersion("11.1.15", "11.1.15"));
	}

}
