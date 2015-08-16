package StringManipulation;

import java.util.Hashtable;
//import java.util.Arrays;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String someString = "interview";
		/* Method 1 - using count arrays
		Integer [] count = createCountArray(someString);
	    System.out.println(Arrays.toString(count));
	    */
		// Method 2 - using hash tables
		Hashtable<Character, Integer> hashforString = createHashTable(someString);
		//System.out.println(hashforString);
		find(hashforString, someString);
	}
	
	public static Hashtable<Character, Integer> createHashTable(String s){
		Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
		for (int i = 0; i < s.length(); i++){
			Integer count = hash.get(s.charAt(i));
			if (count == null){
				int count_1 = 1;
				hash.put(s.charAt(i), count_1);
			}
			else {
				count++;
				hash.put(s.charAt(i), count);
			}
		}
		return hash;
	}
	
	public static void find (Hashtable<Character, Integer> hash, String s){
		for (int i = 0; i < s.length(); i++){
			Integer countValue = hash.get(s.charAt(i));
			if (countValue == 1) {
				System.out.println("First Non Repeated Character is: " + s.charAt(i));
				break;
			}
		}
	}
	
	
	/*
	public static Integer [] createCountArray(String s){
		Integer c[] = new Integer[s.length()];
		for (int i = 0; i < s.length(); i++){
			int count = 0;
			for (int j = 0 ; j < s.length(); j++) {
				if (s.charAt(i) ==  s.charAt(j)){
					count++;
				}
			}
			c[i] = count;
		}
		return c;
	}
	*/

}
