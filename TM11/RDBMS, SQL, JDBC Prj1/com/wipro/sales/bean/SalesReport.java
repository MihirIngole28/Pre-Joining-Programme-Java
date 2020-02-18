package com.wipro.sales.bean;
import java.util.*;

public class SalesReport {
	String salesID;
	Date salesDate;
	String productID;
	String productName;
	int quantitySold;
	double productUnitPrice;
	double salesPricePerUnit;
	double profitAmount;
	
	public void setSalesID(String salesID){
		this.salesID = salesID;
	}
	
	public String getSalesID(){
		return salesID;
	}
	
	public void setSalesDate(Date salesDate){
		this.salesDate = salesDate;
	}
	
	public Date getSalesDate(){
		return salesDate;
	}
	
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
	
	public void setQuantitySold(int quantitySold){
		this.quantitySold = quantitySold;
	}
	
	public int getQuantitySold(){
		return quantitySold;
	}
	
	public void setProductUnitPrice(double productUnitPrice){
		this.productUnitPrice = productUnitPrice;
	}
	
	public double getProductUnitPrice(){
		return productUnitPrice;
	}
	
	public void setSalesPricePerUnit(double salesPricePerUnit){
		this.salesPricePerUnit = salesPricePerUnit;
	}
	
	public double getSalesPricePerUnit(){
		return salesPricePerUnit;
	}
	
	public void setProfitAmount(double profitAmount){
		this.profitAmount = profitAmount;
	}
	
	public double profitAmount(){
		return profitAmount;
	}
}
