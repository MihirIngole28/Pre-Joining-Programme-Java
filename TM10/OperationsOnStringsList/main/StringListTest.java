package main;
import java.util.*;
import bean.StringList;

public class StringListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringList stlist = new StringList();
		String object;
		int choice;
		do{
			System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice){
			case 1: 
				System.out.println("Enter the item to be inserted:");
				sc.nextLine();
				object = sc.nextLine();
				if(stlist.Insert(object) == true)System.out.println("Inserted successfully");
				else System.out.println("Item could not be inserted");
				break;
			case 2: 
				System.out.println("Enter the item to search :");
				sc.nextLine();
				object = sc.nextLine();
				if(stlist.Search(object) == true)System.out.println("Item found in the list.");
				else System.out.println("Item not found in the list.");
				break;
			case 3:
				System.out.println("Enter the item to delete :");
				sc.nextLine();
				object = sc.nextLine();
				if(stlist.Delete(object) == true)System.out.println("Deleted successfully");
				else System.out.println("Item does not exist.");
				break;
			case 4:
				System.out.println("The Items in the list are :");
				stlist.Display();
				break;
			default:
				break;
			}
		}while(choice != 5);
			

	}

}
