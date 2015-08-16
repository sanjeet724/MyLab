package References;

public class SwapTest {

	public static void main(String[] args) {
		int a = 20, b = 30;
		swap(a,b);
		System.out.println("a is " + a);
		System.out.println("b is " + b);
	}
	
	private static void swap (int num1, int num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 is " + num1);
		System.out.println("num2 is " + num2);
	}

}
