package FileHandling;

import java.io.File;
import java.util.Formatter;
import java.io.FileNotFoundException;

public class TextFileFormatterWithCatch {

	public static void main(String[] args) {
		try {
			Formatter out = new Formatter(new File("out_1.txt"));
			int num1 = 1234;
			double num2 = 55.6;
			String name = "Sanjeet";
			out.format("Hi %s,%n", name);
			out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1+num2);
			out.close();
			System.out.println("Done");
		}
		catch (FileNotFoundException ex){
			ex.printStackTrace();
		}
	}
}
