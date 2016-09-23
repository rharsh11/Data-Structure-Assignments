package com.dataStructures.LinkedLists;

/**
 * This is the Single Linked List Implementation. Following functions have been added :
 * add(T data)
 * addAfter(T after, T data)
 * addBefore(T before, T data)
 * addAtHead(T data)
 * getHeadData()
 * getTailData()
 * delete(T data)
 * deleteHead()
 * deleteTail()
 * contains(T data)
 * printList()
 * */
public class SingleLinkedLists <T>{
	
	private Node<T> head;
	
	public SingleLinkedLists(){
		this.head = null;
	}
	
	/**
	 * This function is used to add a new node to the linked list at the end. 
	 * For adding data after a specific node please use addAfter or addBefore Method.
	 * */
	public void add(T data){
		
		Node<T> newNode = new Node<T>(data, null);
		Node<T> temp = head;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(newNode);
		}
	}
	
	/**
	 * This method is used to add a node after a node with specified value. 
	 * If element is not present then false is returned. Else true is returned.
	 * */
	public boolean addAfter(T after, T data)
	{
		Node<T> newNode = new Node<T>(data, null);
		Node<T> temp = head;
		
		if(head != null)
		{
			while(temp != null && !temp.getData().equals(after))
				temp = temp.getNext();
			if(temp != null)
			{
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method is used to add a node before a node with specified value. 
	 * If element is not present then false is returned. Else true is returned.
	 * */
	public boolean addBefore(T before, T data)
	{
		Node<T> newNode = new Node<T>(data, null);
		Node<T> temp = head;
		Node<T> tempBefore = head;
		
		if(head != null)
		{
			while(temp != null && !temp.getData().equals(before))
			{
				tempBefore = temp;
				temp = temp.getNext();
			}
			
			if(temp != null)
			{
				newNode.setNext(temp);
				tempBefore.setNext(newNode);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Adds a node at the start of a linked list
	 * */
	public void addAtHead(T data){
		
		Node<T> newNode = new Node<T>(data,null);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	/**
	 * Returns the value at head
	 * */
	public T getHeadData()
	{
		if(head == null)
			return null;
		else
			return head.getData();
	}
	
	/**
	 * Returns the value of the node at tail
	 * */
	public T getTailData()
	{
		Node<T> temp = head;
		if(head == null)
			return null;
		else{
			while(temp.getNext() != null)
				temp = temp.getNext();
			return temp.getData();
		}
	}
	
	/**
	 * Deletes the first occurrence of the data
	 * True : data preset in the list
	 * False : Data not found in the list
	 * */
	public boolean delete(T data){
		
		Node<T> temp = head;
		Node<T> tempBefore = head;
		
		if(head != null)
		{
			while(temp != null && !temp.getData().equals(data))
			{
				tempBefore = temp;
				temp = temp.getNext();
			}
			if(temp != null)
			{
				if(temp == head)
					head = head.getNext();
				else
					tempBefore.setNext(temp.getNext());
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Deletes the head and returns the value
	 * */
	public T deleteHead()
	{
		T data;
		
		if(head == null)
			return null;
		else
		{
			data = head.getData();
			head = head.getNext();
		}
		
		return data;
	}
	
	/**
	 * Deletes the element present at the tail and returns that value
	 * */
	public T deleteTail()
	{
		Node<T> temp = head;
		Node<T> tempBefore = head;
		T data;
		
		if(head == null)
			return null;
		else
		{
			while(temp.getNext() != null)
			{
				tempBefore = temp;
				temp = temp.getNext();
			}
			
			data = temp.getData();
			if(temp == head)
				head =null;
			else
				tempBefore.setNext(null);
		}
		
		return data;
	}
	
	/**
	 * Returns if the list contains the data mentioned
	 * */
	public boolean contains(T data){
			
		Node<T> temp = head;
		
		if(head != null){
			while(temp != null){
				if(temp.getData().equals(data))
					return true;
				temp = temp.getNext();
			}
		}
		
		return false;
	}
	
	/**
	 * Prints the entire list
	 * */
	public void printList()
	{
		Node<T> temp = head;
		
		while(temp != null){
			System.out.print(temp.getData()+"\t");
			temp = temp.getNext();
		}
		System.out.println();
	}
}
