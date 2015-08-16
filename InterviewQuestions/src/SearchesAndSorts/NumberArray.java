package SearchesAndSorts;

import java.util.Random;

class NumberArray {
	private int length;
	private int [] someArray;

	// default constructor	
	public NumberArray() {
		this.length = 10;
		this.someArray = new int[this.length];
		Random randomGenerator = new Random(); // random numbers between 0-10
		for (int i = 0; i < 10; i++){
			this.someArray[i] = randomGenerator.nextInt(10);
		}
	}
	
	// constructor for array of length l
	public NumberArray(int l){
		this.length = l;
		this.someArray = new int[this.length];
		Random randomGenerator = new Random(); // random numbers between 0-l
		for (int i = 0; i < l; i++){
			this.someArray[i] = randomGenerator.nextInt(l);
		}
	}
	
	// given an array create a NumberArray
	public NumberArray(int [] a){
		this.length = a.length;
		this.someArray = new int[this.length];
		for (int i = 0 ; i < this.length; i++){
			this.someArray[i] = a[i];
		}
	}
	
	public void printArray() {
		for (int i = 0; i < this.length; i++){
			System.out.printf("%d ", this.someArray[i]);
		}
	}
	
	// getter
	public int [] getArray(){
		return this.someArray;
	}
	
	// merge Sort
	public void mSort (){
		int [] sorted = MergeSort.sort(this.someArray);
		this.someArray = sorted;
	}
	
	public void removeDuplicates () {
		int [] duplicatesRemoved = RemoveDuplicates.createNewArray(this.someArray);
		this.someArray = duplicatesRemoved;
		this.length = this.someArray.length;
		
	}
	


}
