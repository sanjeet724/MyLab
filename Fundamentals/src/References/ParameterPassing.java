package References;

public class ParameterPassing {

	public static void main(String[] args) {
		int n = 99;
		increment(n);
		int m = increment_2(n);
		System.out.printf("Number in increment_1 is %d", n);
		System.out.println();
		System.out.printf("Number in increment_2 is %d", m);
		System.out.println();
		System.out.printf("n is still is %d", n);
	}
	
	private static void increment (int number) {
		number = number + 10;
	}
	
	private static int increment_2 (int number) {
		return number + 10;
	}

}
