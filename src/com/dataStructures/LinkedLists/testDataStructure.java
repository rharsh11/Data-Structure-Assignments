package src.com.dataStructures.LinkedLists;

import java.util.Scanner;

public class testDataStructure {
	
	public static void main(String[] args) {
		
		String message = "Enter 1: add(T data)\t2 : addAfter(T after, T data)\t3: addBefore(T before, T data)\t" +
				"4: addAtHead(T data)\n5: getHeadData()\t6: getTailData()\t7: delete(T data)\t" +
				"8: deleteHead()\n9: deleteTail()\t10: Delete At Index\t11: contains(T data)\t12: printList()\t13: " +
				"Get Count\t14: Search Recursively\t15: Exit";
		String newDataMessage = "Enter New Data : ";
		String data = "";
		String temp = "";
		
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		
		SingleLinkedLists<String> list = new SingleLinkedLists<String>();
		
		while(choice != 15){
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
			System.out.println("Enter Index to Delete");
			data = sc.nextLine();
			System.out.println("Element Deleted : "+list.deleteAtIndex(Integer.parseInt(data)));
			break;
		case 11:
			System.out.print("Enter Data to Search : ");
			data = sc.nextLine();
			System.out.println("Success : "+list.contains(data));
			break;
		case 12:
			list.printList();
			break;
		case 13:
			System.out.println("Enter Mode 1-Iter 2-Recursive");
			data=sc.nextLine();
			System.out.println("Count : "+list.getCount(Integer.parseInt(data)));
		case 14:
			System.out.println("Enter Data to Search");
			data=sc.nextLine();
			System.out.println(list.searchRecursively(data,list.getHeadNode()));
		case 15:
			break;
		default:
			System.out.println("Incorrect Option");
		}
		System.out.println(message);
		choice = Integer.parseInt(sc.nextLine());
		}
	}
}
