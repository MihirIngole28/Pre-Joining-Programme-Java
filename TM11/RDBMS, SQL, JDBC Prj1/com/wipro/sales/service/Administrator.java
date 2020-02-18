package com.wipro.sales.service;
import java.util.*;
import com.wipro.sales.bean.*;
import com.wipro.sales.dao.*;
import com.wipro.sales.util.*;

public class Administrator {
	
	StockDao stockD = new StockDao();
	SalesDao salesD = new SalesDao();
	
	public String insertStock(Stock stock){
		if (stock != null && stock.getProductName().length() >= 2) {
			String productID = stockD.generateProductID(stock.getProductName());
			stock.setProductID(productID);
			if (stockD.insertStock(stock) == 1)
				return productID;
			else
				return "Data not Valid for insertion";
		} else {
			return "Data not Valid for insertion";
		}
	}
	
	public String deleteStock(String ProductID) {		
		if (stockD.deleteStock(ProductID) == 1)
			return "Deleted";
		else 
			return "Record cannot be deleted";
	}
	
	
	public String insertSales(Sales sales) {		
		
		try{
			if (sales == null)
				return "Object not valid for insertion";
			
			if (stockD.getStock(sales.getProductID()) == null)
				return "Unknown Product for sales";
			
			if (stockD.getStock(sales.getProductID()).getQuantityOnHand() < sales.getQuantitySold())
				return "Not enough stock on hand for sales";
			
			if (sales.getSalesDate().before(new Date()))
				return "Invalid date";
			
			String salesID = salesD.generateSalesID(sales.getSalesDate());
			sales.setSalesID(salesID);
			
			if (salesD.insertSales(sales) == 1) {
				if (stockD.updateStock(sales.getProductID(), sales.getQuantitySold()) == 1)
					return "Sales record inserted successfully";
				else 
					return "Error";
			} else {
				return "Error";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "Error";
		}
			
	}
	
	
	public ArrayList<SalesReport> getSalesReport(){
		return salesD.getSalesReport();
	}
			
}
