package cracking.coding.chapter_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesList {
	public static <E extends Comparable<E>>
	List<E> removeDuplicates(List<E> list){
		Set<E> set = new HashSet<>(list);
		ArrayList<E> arrayList = new ArrayList<>(set);
		Collections.sort(arrayList);
		return arrayList;
	}
}
