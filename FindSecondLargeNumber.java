package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargeNumber {

	public static void main(String[] args) {

		/*
		 * Pseudo Code: 
		 * 1) Arrange the array in ascending order 
		 * 2) Pick the 2nd element from the last and print it
		 */

		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		System.out.println("List Before Ascending: " + list);
		Collections.sort(list);
		System.out.println("List After Ascending: " + list);
		System.out.println("Second Largest NUmber is: " + list.get(list.size() - 2));
	}

}
