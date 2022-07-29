package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input String text =
		 * 	"We learn java basics as part of java sessions in java week1"; 
		 * b) Convert the String to Char Array 
		 * c) Create a Set with Genetic Character 
		 * d) add the Char Array values into the Set 
		 * e) Print the Set
		 */

		String text = "We learn java basics as part of java sessions in java week1";
		char[] chText = text.toCharArray();

		Set<Character> setText = new LinkedHashSet<Character>();

		for (int i = 0; i < chText.length; i++) {
			setText.add(chText[i]);
		}
		System.out.println(setText);
	}

}
