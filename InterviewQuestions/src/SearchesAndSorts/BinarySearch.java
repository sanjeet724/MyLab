package SearchesAndSorts;

public class BinarySearch {
	
	public static void main(String[] args) {
	   NumberArray a = new NumberArray(25);
	   System.out.println("Randomly generated array: ");
	   a.printArray();
	   // remove duplicates from the random array
	   a.removeDuplicates();
	   System.out.println("\nArray with duplicates removed: ");
	   a.printArray();
	   // sort the array to prepare for binary search
	   a.mSort();
	   System.out.println("\nSorted Array: ");
	   a.printArray();
	   // Binary search - searching for 8
	   System.out.println("\nSearching for 8 ...");
	   int find = bs(a.getArray(), 8);
	   if (find != -1){
		   System.out.println("Key found at index: " + find);
	   }
	   else {
		   System.out.println("Key not found");
	   }
	}
	
	public static int bs(int [] a, int key){
		int high = a.length-1;
		int low = 0;
	    while (low <= high) {
	       // Key is in a[lo..hi] or not present.
	       int mid = low + (high - low) / 2;
	       if (key < a[mid])
	    	   high = mid - 1;
	       else if (key > a[mid]) 
	    	   low = mid + 1;
	       else 
	    	   return mid;
	        }
		return -1;
	}
}

		




