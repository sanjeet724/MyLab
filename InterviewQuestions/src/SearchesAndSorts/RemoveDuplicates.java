package SearchesAndSorts;

import java.util.Enumeration;
import java.util.Hashtable;

public class RemoveDuplicates {

	public static Hashtable<Integer, Integer> getCount(int [] a){
		Hashtable<Integer, Integer> countHash= new Hashtable<Integer, Integer>();
		for (int i = 0; i < a.length; i++){
			if (countHash.get(a[i]) == null){
				int count = 1;
				countHash.put(a[i], count);	
			}
			else {
				int current_count = countHash.get(a[i]);
				current_count++;
				countHash.put(a[i], current_count);
			}
		}
		return countHash;
	}

	
	public static int [] createNewArray(int [] a) {
		Hashtable<Integer, Integer> hash = getCount(a);
		int index  = 0;
		int size = hash.size();
		int [] b = new int[size];
		Enumeration<Integer> e = hash.keys();
		while (e.hasMoreElements()) {
			int key = (int) e.nextElement();
			b[index] = key;
			index++;
		}
		return b;
	}

}
