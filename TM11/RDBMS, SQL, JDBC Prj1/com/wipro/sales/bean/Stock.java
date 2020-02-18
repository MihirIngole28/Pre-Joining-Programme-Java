package com.wipro.sales.bean;

public class Stock {
	String productID;
	String productName;
	int quantityOnHand;
	double productUnitPrice;
	int reorderLevel;
	
	public void setProductID(String productID){
		this.productID = productID;
	}
	
	public String getProductID(){
		return productID;
	}
	
	public void setProductName(String productName){
		this.productName = productName;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public void setQuantityOnHand(int quantityOnHand){
		this.quantityOnHand = quantityOnHand;
	}
	
	public int getQuantityOnHand(){
		return quantityOnHand;
	}
	
	public void setProductUnitPrice(double productUnitPrice){
		this.productUnitPrice = productUnitPrice;
	}
	
	public double getProductUnitPrice(){
		return productUnitPrice;
	}

	public void setReorderLevel(int reorderLevel){
		this.reorderLevel = reorderLevel;
	}
	
	public int getReorderLevel(){
		return reorderLevel;
	}
}
