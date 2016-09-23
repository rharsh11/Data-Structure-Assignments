package src.com.dataStructures.LinkedLists;

public class Node <T>{
	
	private T data;
	private Node<T> next;
	
	protected Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	protected T getData() {
		return data;
	}

	protected void setData(T data) {
		this.data = data;
	}

	protected Node<T> getNext() {
		return next;
	}

	protected void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	
}
