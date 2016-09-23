package com.dataStructures.StackImpl;

import java.util.Scanner;

public class testStack {
	
	public static void main(String[] args) {
		
		String message = "Enter 1: Push\t2: Pop\t3: Show Top\t4: isEmpty\n5: getStackSize\t6: Print Stack\t7: Exit";
		int choice = -1;
		String data = "";
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		
		while(choice != 7){
		System.out.println(message);
		choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1:
			System.out.print("Enter Element to Push : ");
			data = sc.nextLine();
			stack.push(data);
			break;
		case 2:
			System.out.println("Pop : "+stack.pop());
			break;
		case 3:
			System.out.println("Show Top : "+stack.showTop());
			break;
		case 4:
			System.out.println("Empty : "+stack.isEmpty());
			break;
		case 5:
			System.out.println("Stack Size : "+stack.getStackSize());
			break;
		case 6:
			stack.printStack();
			break;
		case 7:
			break;
		default:
			System.out.println("Invalid Choice");
		}
		}
	}
}
