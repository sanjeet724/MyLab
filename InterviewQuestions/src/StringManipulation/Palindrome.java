package StringManipulation;


public class Palindrome {

	public static void main(String[] args) {
		String someString = "mam";
		int check = checkPalindrome(someString);
		if (check == 0){
			System.out.printf("%s is a Palindrome", someString);
		}
	}
	
	public static int checkPalindrome(String s){
		int len = s.length()-1;
		if (len < 0) {
			System.out.printf("Empty String");
			return -1;
		}
		for (int i = 0; i <= len/2; i++){
			if (s.charAt(i)!=s.charAt(len-i)) {
				System.out.printf("%s is NOT a Palindrome", s);
				return 1;
			}
		}
		return 0;
	}

}
