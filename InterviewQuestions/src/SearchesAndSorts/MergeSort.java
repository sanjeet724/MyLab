package SearchesAndSorts;

public class MergeSort {

	public static int [] sort (int [] array){
		// base condition
		if (array.length < 2){
			   return array;
		}
		int mid = array.length/2;
		int rightSize = array.length - mid;
		// Divide the arrays into 2 halves
		int [] A = divideLeft(array, mid);
		int [] B = divideRight(array, rightSize, mid);
		A = sort(A);
		B = sort(B);
		int [] m = merge(A, B);
		return m;
	}
	
	private static int[] divideLeft(int[] array, int size) {
		int [] A = new int[size];
		for (int i = 0; i < size; i++) {
			A[i] = array[i];
		}
		return A;
	}
	
	private static int[] divideRight(int[] array, int size, int startIndex) {
		int [] B = new int[size];
		for (int i = 0 ; i < size ; i++) {
			B[i] = array[startIndex+i];
		}
		return B;
	}
	
	private static int [] merge(int [] A, int [] B){
		int i = 0,j = 0,k = 0;
		int n = A.length;
		int m = B.length;
		int [] C = new int[n+m];
		// Create a bigger array to store the merged arrays
		while (i < n && j < m) {
			if (A[i] < B[j]) {
				C[k] = A[i];
				i++;
			}
			else {
				C[k] = B[j];
				j++;
			}
			k++;
		}
		// Copy the smaller array contents
		for (int v = k; v < n+m; v++) {
			if (i < n) {
				C[v] = A[i];
				i++;
			}
			else if (j < m ){
				C[v] = B[j];
				j++;
			}
		}
		return C;
	}

}
