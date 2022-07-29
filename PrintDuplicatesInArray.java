package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		/*
		 * Pseudo Code: 
		 * a) Declare a array 
		 * b) Declare a List 
		 * c) iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		 * d) compare both the loop variables & check they're equal
		 * e) increase the count if both the arrays are equal
		 * f) Print the Duplicates in the Array
		 * 
		 */

		int[] values = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length - 1; j++) {
				list.add(values[i]);
				if (values[i] == values[j]) {
					System.out.println(values[i]);
				}
			}
		}
	}
}