package cracking.coding.chapter_one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverse() {
		assertEquals("liaf", ReverseString.reverse("fail"));
		assertEquals("abcd", ReverseString.reverse("dcba"));
		assertEquals("olleh", ReverseString.reverse("hello"));
		assertEquals("ufnoc", ReverseString.reverse("confu"));
	}
	
	@Test
	public void reverse_exceptionThrownCase() {
		assertThrows(RuntimeException.class,
	            ()->{
	            	ReverseString.reverse(null);
	            });
	}

}
