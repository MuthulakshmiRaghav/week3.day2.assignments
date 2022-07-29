package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code a) Declare An array for {3,2,11,4,6,7}; 
		 * b) Declare another array for {1,2,8,4,9,7}; 
		 * c) Declare two List<Integer> 
		 * d) Add the array values into List 
		 * e) Compare Both the List using a condition statement 
		 * f) Print the common values of the arrays
		 */

		int[] numSet1 = { 3, 2, 11, 4, 6, 7 };
		int[] numSet2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < numSet1.length; i++) {
			list1.add(numSet1[i]);
			list2.add(numSet2[i]);
			if (numSet1[i] == numSet2[i]) {
				System.out.println(numSet1[i]);
			}
		}
		System.out.println("List1 : " + list1);
		System.out.println("List2 : " + list2);

	}

}
