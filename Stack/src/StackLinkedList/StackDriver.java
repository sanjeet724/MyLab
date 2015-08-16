package StackLinkedList;

//import java.util.Random;
import java.util.Scanner;

public class StackDriver {

	public static void main(String[] args) {
		LinkedStack myStack = new LinkedStack();
		//lets create a random stack of integers
//		for (int i = 0 ; i < 10; i ++) {
//			Random num = new Random();
//			int item = num.nextInt(1000);
//			System.out.println("Number generated is " + item);
//			myStack.push(item);
//		}
		Scanner scanner = new Scanner(System.in);
		String someString;
		System.out.println("Enter a string: ");
		someString = scanner.nextLine();
		//System.out.println("String entered is: " + someString);
		scanner.close();
		for (int i = 0; i < someString.length(); i++) {
			myStack.push(someString.charAt(i));
		}
		
		// lets pop the items
//		while (myStack.isEmpty() == false) {
//			myStack.pop();
//		}
		// lets reverse the string
		String reversed = "";
		while (myStack.isEmpty() == false) {
			reversed = reversed + myStack.pop();
		}
		
		System.out.println("Reversed String is: " + reversed);
		
		// check if palindrome
		
		if (reversed.equals(someString)) {
			System.out.println("Strings are palindrome");
		}
	}
}