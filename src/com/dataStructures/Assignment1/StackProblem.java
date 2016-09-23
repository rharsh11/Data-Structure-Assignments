package src.com.dataStructures.Assignment1;

import java.util.Scanner;

import src.com.dataStructures.StackImpl.Stack;

public class StackProblem {
	
	Stack<Character> stack;
	
	public StackProblem() {
		this.stack = new Stack<>();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String to be Checked");
		Scanner sc =  new Scanner(System.in);
		String data = sc.nextLine();
		
		StackProblem obj = new StackProblem();
		obj.performCheck(data);
	}
	
	/**
	 * This function performs the check and prints Success if entire data is in correct format.
	 * Or it prints position where the discrepency occurs.
	 * */
	public void performCheck(String data){
		Character ch,output;
		int length = data.length();
		int count = 0;
		
		while(count < length)
		{
			ch = data.charAt(count);
			if(ch == '(' || ch == '{' || ch == '[')
			{
				stack.push(ch);
			}
			else if(ch == ')' || ch == '}' || ch == ']'){
				output = stack.pop();
				if((ch ==')' && output !='(') || (ch =='}' && output !='{') || (ch ==']' && output !='[')){
					System.out.println(count+1);
					System.exit(-1);
				}
			}
			count++;
		}
		
		if(stack.isEmpty())
			System.out.println("Success");
		else
			System.out.println(count);
		
	}

}
