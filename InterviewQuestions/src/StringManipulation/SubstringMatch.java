package StringManipulation;

public class SubstringMatch {

	public static void main(String[] args) {
		String someString = "This is a nice way to do things";
		String sub = "nicei";
		if (checkSubString(someString, sub)) {
			System.out.printf("Substring Found");
		}
		else {
			System.out.printf("No Substring Found");
		}
		
//		int s = search (someString, sub);
//		if (s == someString.length()){
//			System.out.println("Substring not found");
//		} 
//		else {
//			System.out.println("Substring found");
//		}
	}
	
//	public static int search(String pat, String txt)
//	  {
//	     int M = pat.length();
//	     int N = txt.length();
//	     for (int i = 0; i <= N - M; i++)
//	     {
//	        int j;
//	        for (j = 0; j < M; j++)
//	           if (txt.charAt(i+j) != pat.charAt(j))
//	              break;
//	        if (j == M) return i;  // found
//	     }
//	     return N;                 // not found
//	  }
	

	public static boolean checkSubString(String s1, String s2) {
		int i = 0 ,j = 0;
		//char c =  ' ';
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) ==  s2.charAt(j)) {
//			    System.out.println("s1(i) is " + s1.charAt(i));
//				System.out.println("s2(j) is " + s2.charAt(j));
//				System.out.println("i is " + i);
//				System.out.println("j is " + j);
				j++;
				i++;
			}
			else {
				//System.out.println("s1(i) is " + s1.charAt(i));
				i++;
			}
		}
		//System.out.println("i is " + i);
		//System.out.println("j is " + j);
		if (j == s2.length()) {
			return true;
		}
		else {
			return false;
		}
	}
}
