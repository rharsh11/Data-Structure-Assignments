package src.com.dataStructures.LinkedLists;

import java.util.Scanner;

public class testDataStructure {
	
	public static void main(String[] args) {
		
		String message = "Enter 1: add(T data)\t2 : addAfter(T after, T data)\t3: addBefore(T before, T data)\t" +
				"4: addAtHead(T data)\n5: getHeadData()\t6: getTailData()\t7: delete(T data)\t" +
				"8: deleteHead()\n9: deleteTail()\t10: contains(T data)\t11: printList()\t12: Exit";
		String newDataMessage = "Enter New Data : ";
		String data = "";
		String temp = "";
		
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		
		SingleLinkedLists<String> list = new SingleLinkedLists<String>();
		
		while(choice != 12){
		switch(choice){
		case 1:
			System.out.print(newDataMessage);
			data = sc.nextLine();
			list.add(data);
			break;
		case 2:
			System.out.print(newDataMessage);
			data = sc.nextLine();
			System.out.print("Add After : ");
			temp = sc.nextLine();
			System.out.println("Success : "+list.addAfter(temp, data));
			break;
		case 3:
			System.out.print(newDataMessage);
			data = sc.nextLine();
			System.out.print("Add Before : ");
			temp = sc.nextLine();
			System.out.println("Success : "+list.addBefore(temp, data));
			break;
		case 4:
			System.out.print(newDataMessage);
			data = sc.nextLine();
			list.addAtHead(data);
			break;
		case 5:
			System.out.println(list.getHeadData() == null?"Null":list.getHeadData());
			break;
		case 6:
			System.out.println(list.getTailData() == null?"Null":list.getTailData());
			break;
		case 7:
			System.out.print("Enter Data to delete : ");
			data = sc.nextLine();
			System.out.println("Success : "+list.delete(data));
			break;
		case 8:
			System.out.println("Element : "+list.deleteHead());
			break;
		case 9:
			System.out.println("Element : "+list.deleteTail());
			break;
		case 10:
			System.out.print("Enter Data to Search : ");
			data = sc.nextLine();
			System.out.println("Success : "+list.contains(data));
			break;
		case 11:
			list.printList();
			break;
		case 12:
			break;
		default:
			System.out.println("Incorrect Option");
		}
		System.out.println(message);
		choice = Integer.parseInt(sc.nextLine());
		}
	}
}
