package Recursions;

public class Fibonnaci {

	public static void main(String[] args) {
		int [] fib_array = createFiboSeries(10);
		// non-recursive version
		// int [] fib_array = nonRecursive_Fibonacci(10);
		printArray(fib_array);
	}
	
	public static int recursive_Fibonnaci(int n){
		if (n == 1 || n == 2){
			return 1;
		}
		return recursive_Fibonnaci(n-1) + recursive_Fibonnaci(n-2); 
	}
	
	public static int[] nonRecursive_Fibonacci(int n){
		int [] fib_array = new int [n];
		fib_array[0] = 1;
		fib_array[1] = 1;
		for (int i = 2; i < n; i++){
			fib_array[i] = fib_array[i-1]+fib_array[i-2];
		}
		return fib_array;
	}
	
	public static int [] createFiboSeries(int n) {
		int [] fib_array = new int[n];
		for (int i = 0; i < n; i++){
			fib_array[i] = recursive_Fibonnaci(i+1);
		}
		return fib_array;
	}
	
	public static void printArray(int [] a) {
		for (int i = 0; i < a.length; i++){
			System.out.printf("%d ", a[i]);
		}
	}
}
