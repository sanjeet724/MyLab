package QueueLinkedList;


public class LinkedQueue {
	private Node head,tail = null;
	
	private class Node {
		Object item;
		Node next;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void enqueue(Object item) {
		Node temp = tail;
		tail = new Node();
		tail.item = item;
		tail.next = null;
		if (isEmpty()){
			head = tail;
		} else {
			temp.next = tail;
		}
	}
	
	public Object dequeue(){
		Object item = head.item;
		head = head.next;
		if (isEmpty()){
			tail = null;
		}
		return item;
	}

}
