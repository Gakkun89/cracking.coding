package cracking.coding;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		System.out.println(Arrays.stream("10.1.1".split("\\.")).map(String::trim).mapToInt(Integer::parseInt).toArray()[0]);
	}

}
