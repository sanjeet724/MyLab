package StackLinkedList;

public class LinkedStack {
	private Node first = null;
	
	private class Node {
		Object item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void push(Object item) {
		Node temp = first;
		first = new Node();
		first.item = item;
		first.next = temp;
	}
	
	public Object pop() {
		Object item = first.item;
		first = first.next;
		return item;
	}
}
