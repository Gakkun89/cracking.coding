package cracking.coding.chapter_one;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesListTest {

	@Test
	void testRemoveDuplicates() {
		List<String> input1 = new ArrayList<>();
		input1.add("a");
		input1.add("b");
		input1.add("d");
		input1.add("c");
		input1.add("e");
		input1.add("e");
		List<String> result = RemoveDuplicatesList.removeDuplicates(input1);
		assertEquals("[a, b, c, d, e]", result.toString());
	}

}
