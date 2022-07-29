package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		
		/* input: abbaba
		 * output: b
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		
		String input = "abbaba";
		char[] chStr = input.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<chStr.length;i++)
		{
			if(map.containsKey(chStr[i]))
			{
			map.put(chStr[i], map.get(chStr[i])+1);
			}
			else
				map.put(chStr[i], 1);
		}
		System.out.println(map);	
		
		int maxOccurence = 0;
		char maxOccurChar = 0;
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > maxOccurence)
			{
				maxOccurence = entry.getValue();
				maxOccurChar = entry.getKey();
			}
		}			System.out.println(maxOccurChar);

	}

}
