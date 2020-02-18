package com.wipro.sales.bean;
import java.util.*;

public class Sales {
	String salesID;
	Date salesDate;
	String productID;
	int	quantitySold;
	double salesPricePerUnit;
	
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
	
	public void setQuantitySold(int quantitySold){
		this.quantitySold = quantitySold;
	}
	
	public int getQuantitySold(){
		return quantitySold;
	}
	
	public void setSalesPricePerUnit(double salesPricePerUnit){
		this.salesPricePerUnit = salesPricePerUnit;
	}
	
	public double getSalesPricePerUnit(){
		return salesPricePerUnit;
	}
}
