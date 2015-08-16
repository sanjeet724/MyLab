package ObjectList;

/* available working functions
myList.prependList(someIntegers[i]) - adds to head
myList.appendList(someIntegers[i]) - adds to tail
myList.printTailtoHead()  - prints tail to head
myList.printHeadtoTail() - prints head to tail
myList.trackHeadandTail() - prints the list's head and tail
myList.reverseList() - reverses the list
myList.getItemAtIndex(index) - finds the item at index
myList.insertItematIndex(item,index) - inserts item at an index
myList.search(360) - search for a number in the list
myList.destroyList() - deletes the list
myList.removeitemfromHead() - removes item form head
myList.removeitemfromTail() - removes item from tail
myList.removeitemfromIndex(5) - removes item from index
*/

public class ListDriver {

	public static void main(String[] args) {
		List myList = new List();
		Integer [] someIntegers = {10,-1,12,890,-57,0,10,30,78,33};
		for (int i = 0; i < someIntegers.length; i++){
			myList.appendList(someIntegers[i]);
		}
		myList.printHeadtoTail();
//		myList.reverseList();
//		myList.printHeadtoTail();
//		Object p = myList.getItemAtIndex(5);
//		System.out.println("p is: " + p);
//		myList.insertItematIndex(656,10);
//		myList.printHeadtoTail();
//		myList.search(360);
//		myList.destroyList();
//		myList.insertItematIndex(656,0);
//		myList.removeitemfromHead();
//		myList.printHeadtoTail();
//		myList.removeitemfromTail();
//		myList.printHeadtoTail();
//		myList.insertItematIndex(656,10);
//		myList.printHeadtoTail();
//		myList.destroyList();
//		myList.insertItematIndex(657,0);
//		myList.removeitemfromIndex(10);
//		myList.destroyList();
//		myList.removeitemfromIndex(5);
//		myList.printHeadtoTail();
		
	}

}


