package com.wipro.sales.main;
import java.util.*;
import java.text.*;
import com.wipro.sales.bean.*;
import com.wipro.sales.dao.*;
import com.wipro.sales.util.*;
import com.wipro.sales.service.*;

public class SalesApplication {
	public static void main(String args[]){
		
		Administrator admin = new Administrator();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("1. Insert Stock\n2. Delete Stock\n3. Insert Sales\n4. View Sales Report\nEnter your Choice: ");
			choice = sc.nextInt();
			
			switch(choice){
			case 1:Stock stock = new Stock();
				sc.nextLine();
				System.out.println("Enter product ID: ");
				stock.setProductID(sc.nextLine());
				System.out.println("Enter product name: ");
				stock.setProductName(sc.nextLine());
				System.out.println("Enter quantity on hand: ");
				stock.setQuantityOnHand(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter product unit price: ");
				stock.setProductUnitPrice(sc.nextDouble());
				System.out.println("Enter product reorder level: ");
				stock.setReorderLevel(sc.nextInt());
				sc.nextLine();
				admin.insertStock(stock);
			break;
			case 2:
				System.out.println("Enter product id to be deleted: ");
				sc.nextLine();
				String removeId = sc.nextLine();
				removeId = admin.deleteStock(removeId);
				if (removeId != null) System.out.println(removeId + " removed successfully");
				break;
			case 3:
				Sales sales = new Sales();
				System.out.println("Enter sales id: ");
				sc.nextLine();
				sales.setSalesID(sc.nextLine());
				System.out.println("Enter date (dd-mm-yyyy): ");
				String sDate = sc.nextLine();  
				try{
					Date date = new SimpleDateFormat("dd-mm-yyyy").parse(sDate); 
					sales.setSalesDate(date);
					System.out.println("Enter product id: ");
					sales.setProductID(sc.nextLine());
					System.out.println("Enter quantity sold: ");
					sales.setQuantitySold(sc.nextInt());
					sc.nextLine();
					System.out.println("Enter sales price per unit: ");
					sales.setSalesPricePerUnit(sc.nextDouble());
					admin.insertSales(sales);
				}catch(Exception e){
					e.printStackTrace();
				}
			    
				break;
			case 4:
				admin.getSalesReport();
				break;
			default:
				break;
			}
		}while(choice > 0 && choice < 5);
	}
}
