package ObjectList;

public class List {
	private Node head,tail;
	private int numOfItems;
	
	public List() {
		numOfItems = 0;
		head = null;
		tail = null;
	}
	
	public boolean isEmpty(){
		return (numOfItems == 0);
	}
	
	public int size() {
		return numOfItems;
	}

	// Add an item to the beginning of the list 
	public void prependList(Object newItem){
		Node newNode = new Node(newItem);
		if (isEmpty()) {
			System.out.println("Creating List in --> prependList");
			tail = newNode;
		}else {
			newNode.next = head;
		}
		head = newNode;
		numOfItems++;
	}
	// Add an item to the end of the list 
	public void appendList(Object newItem) {
		Node newNode = new Node(newItem);
		if (isEmpty()) {
			System.out.println("Creating List in --> appendList");
			head = newNode;
		}else {
			tail.next = newNode;
		}
		tail = newNode;
		numOfItems++;
	}
	
//	public void trackHeadandTail(){
//		System.out.println("Head is: " + head.item);
//		System.out.println("Tail is: " + tail.item);
//		if (tail.next == null){
//			System.out.println("Tail's next is null");
//		}
//	}
	
	public void reverseList(){ 
		System.out.println("Reversing the list");
		Node reverse = null;
		Node current = head;
		tail = head;
		while (current != null){
			Node after = current.next;
			current.next = reverse;
			reverse = current;
			current = after;
		}
		head = reverse;
}
	
	public void printHeadtoTail () {
		if (!isEmpty()) {
			Node current = head;
			System.out.println("Head--->Tail: ");
			while (current!= null ){
				System.out.print(current.item);
				current = current.next;
				System.out.print(" ");
			   }
			System.out.println("");
		}
		else {
			System.out.println("printHeadtoTail --> List is Empty ");
		}
	}
	
	/* This function is not needed when we have a reverseList functionality */
//	public void printTailtoHead() {
//		Node current = head;
//		System.out.println("Tail--->Head: ");
//		/* hackish solution - read the list for head to tail and putting them into an array */
//		Object[] nodeItems = new Object[numOfItems];
//		Integer counter = 0;
//		while (current!= null ){ 
//			nodeItems[counter] = current.item;
//			current = current.next;
//			counter++;
//		   }
//		for (int i = numOfItems-1; i >=0; i--){
//			System.out.print(nodeItems[i]);
//			System.out.print(" ");
//		}
//		System.out.println("");
//	}
	
	/* This function returns a node at index i */
	public Node itematIndexHelper (int index) {
		Node current = head;
		for (int i = 0; i < index ; i++){
			current = current.next;
		}
		return current;
	}
	
	/* This function will check if index provided is valid */
	/* Returns true if index is invalid or list is empty */
	public Boolean checkIndexValidity(int index){
		if (index < 0 || index > numOfItems-1) {
			System.out.println("Invalid index");
			return true;
		}
		return false ;
	}
	
	public Object getItemAtIndex(int index) {
		if (!checkIndexValidity(index)){
			System.out.println("Object Found");
			Node currentItematIndex = this.itematIndexHelper(index);
			return currentItematIndex.item;
		}
		return null;
	}
	
	public void insertItematIndex(Object newItem, int index) {
		System.out.println("Inserting " +  newItem + " at index " + index);
		if (!isEmpty()) {
			if (index == 0) {
				this.prependList(newItem);
				return;
			}
			if (index == numOfItems){
				this.appendList(newItem);
				return;
			}
			if (!checkIndexValidity(index)){
				Node prevNode = this.itematIndexHelper(index-1);
				Node currentNode = prevNode.next;
				Node newNode = new Node(newItem);
				prevNode.next = newNode;
				newNode.next = currentNode;
				numOfItems++;
				return;
			}
		}
		else {
			System.out.println("insertItematIndex --> List is empty");
		}
    }
	
	public void search(Object someObject) {
		boolean notFound = true;
		if (isEmpty()){
			System.out.println("search --> List is empty");
			return ;
		}
		else {
		     Node current = head;
		     while (current != null && notFound){
		    	 if (current.item == someObject){
		    		 notFound = false;
		    		 System.out.println("Object Found");
		    		 return;
		    	 }
		    current = current.next;
		    }
		}
		if (notFound) {
			System.out.println("Object not Found");
		}
	}
	
	public void destroyList() {
		head = null;
		tail = null;
		numOfItems = 0;
		System.out.println("List destroyed");
	}
	
	public void removeitemfromHead(){
		if (!isEmpty()) {
			Node current = head;
			head = current.next;
			current=null;
			numOfItems--;
		}
		else {
			System.out.println("removeitemfromHead --> List is empty");
		}
	}
	
	public void removeitemfromTail(){
		if (!isEmpty()) {
			Node current = itematIndexHelper(numOfItems-2); // get the 2nd last element;
			current.next = null;
			tail = current;
			numOfItems--;
		}
		else {
			System.out.println("removeitemfromTail --> List is empty");
		}
	}
	
	public void removeitemfromIndex(int index) {
		System.out.println("Deleting  item at index " + index);
		if (!isEmpty()) {
			if (index == 0) {
				this.removeitemfromHead();
				return;
			}
			if (index == numOfItems-1) {
				this.removeitemfromTail();
				return;
			}
			if (!checkIndexValidity(index)){
				Node prevNode = this.itematIndexHelper(index-1);
				Node currentNode = prevNode.next;
				Node nextNode = currentNode.next;
				currentNode = null;
				prevNode.next = nextNode;
				numOfItems--;
				return;
			}
		}
		else {
			System.out.println("removeitemfromIndex --> List is empty");
		}
	}
}
