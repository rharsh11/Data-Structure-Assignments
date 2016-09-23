package com.dataStructures.StackImpl;

import com.dataStructures.LinkedLists.SingleLinkedLists;

/**
 * This Stack will be using linked list. Hence no StackOverflow.
 * Following functions are implemented-
 * push
 * pop
 * showTop
 * isEmpty
 * getStackSize
 * printStack
 * */
public class Stack <T> {
	
	private SingleLinkedLists<T> stack;
	private int length;
	
	public Stack() {
		this.stack = new SingleLinkedLists<T>();
		this.length = 0;
	}
	
	/**
	 * Implements Push function of Stack
	 * */
	public void push(T data){
		stack.addAtHead(data);
		length++;
	}
	
	/**
	 * Implements pop function of a Stack.
	 * In case of Stack Underflow returns null
	 * */
	public T pop(){
		//Stack Underflow check
		if(stack.getHeadData() == null)
			return null;
		else
		{
			length--;
			return stack.deleteHead();
		}
	}
	
	/**
	 * Returns top of stack without poping it.
	 * */
	public T showTop(){
		return stack.getHeadData();
	}
	
	/**
	 * Checks if the Stack is empty
	 * */
	public boolean isEmpty()
	{
		if(stack.getHeadData() == null)
			return true;
		else
			return false;
	}
	
	/**
	 * Returns current Stack Size
	 * */
	public int getStackSize()
	{
		return length;
	}
	
	/**
	 * Print the Stack
	 * */
	public void printStack()
	{
		if(length == 0)
			System.out.println("Empty Stack");
		else
			stack.printList();
	}
	
}
