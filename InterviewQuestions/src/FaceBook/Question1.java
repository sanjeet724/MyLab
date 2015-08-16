// Given a number n, find the largest number just smaller than n 
// that can be formed using the same digits as n (e.g if n is 1342
// the result is 1324

package FaceBook;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Please enter the number: %n");
		String inputStr = in.next();
		int len = inputStr.length();
		int number = Integer.parseInt(inputStr);
		// To-Do - add code to check valid input
		getNextLargestNumber(number, len);
		in.close();
	}
	
	public static void getNextLargestNumber(int number, int numOfDigits){
		// System.out.println("The number is: " + number );
		// System.out.println("Num of Digits: " + numOfDigits );
		
	}
}
