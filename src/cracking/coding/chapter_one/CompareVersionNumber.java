package cracking.coding.chapter_one;

import java.util.Arrays;

public class CompareVersionNumber {
	public static int compareVersion(String v1, String v2) {
		// -1 if v1 < v2
		// 1 if v1 > v2
		// 0 if v1 == v2
		int[] v1Arr = Arrays.stream(v1.split("\\.")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		int[] v2Arr = Arrays.stream(v2.split("\\.")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		int idx = 0;
		while(idx < v1Arr.length) {
			if(v1Arr[idx] < v2Arr[idx]) {
				return -1;
			}else if(v1Arr[idx] > v2Arr[idx]) {
				return 1;
			}
			idx ++;
		}
		return 0;
	}
}
