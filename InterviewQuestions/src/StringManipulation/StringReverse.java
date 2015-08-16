package StringManipulation;

public class StringReverse {

	public static void main(String[] args) {
		String someString = "Hello World";
		//String reversed_1 = reverseString(someString);
		String reversed_2 = betterReverse(someString);
		System.out.println("Input String is:    " + someString);
		System.out.println("Reversed String is: " + reversed_2);
	}
	
	public static String reverseString(String inputString){
		String result = "";
		for (int i = inputString.length()-1;i >= 0 ;i--){
			result = result + inputString.charAt(i);
		}
		return result;
	}
	
	// A better way
	 public static String betterReverse ( String s ) {
	        int length = s.length(), last = length - 1;
	        char[] chars = s.toCharArray();
	        for ( int i = 0; i < length/2; i++ ) {
	            char c = chars[i];
	            chars[i] = chars[last - i];
	            chars[last - i] = c;
	        }
	        return new String(chars);
	    }
}
