package project;

import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		VideoStore store = new VideoStore();
		
		int choice = 0;
		
		
		
		do{
			System.out.println("MAIN MENU\n=========\n1. Add Videos:\n2. Check Out Video :\n3. Return Video :\n"
					+ "4. Receive Rating :\n5. List Inventory :\n6. Exit :\nEnter your choice (1..6): ");
			choice = sc.nextInt();
			sc.nextLine();
			String str;
			switch(choice){
			case 1: System.out.println("Enter the name of the video you want to add: ");				
				str = sc.nextLine();
				store.addVideo(str);
				System.out.println("Video \"" + str + "\" added out successfully.");
				break;
				
			case 2: System.out.println("Enter the name of the video you want to check out: ");
				str = sc.nextLine();
				store.doCheckout(str);
				System.out.println("Video " + str + " checked out successfully.");
				break;
			
			case 3: System.out.println("Enter the name of the video you want to Return: ");
				str = sc.nextLine();
				store.doReturn(str);
				System.out.println("Video " + str + " returned successfully.");
				break;
				
			case 4: System.out.println("Enter the name of the video you want to Rate: ");
				str = sc.nextLine();
				System.out.println("Enter the rating for this video: ");
				int rating = sc.nextInt();
				store.receiveRating(str, rating);
				System.out.println("Rating " + rating + " has been mapped to the Video " + str + ".");
				break;
				
			case 5: store.listInventory();
				break;
				
			default:
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			}
		}while(choice != 6);

	}

}
