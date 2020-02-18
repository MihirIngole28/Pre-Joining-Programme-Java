package com.wipro.sales.dao;
import com.wipro.sales.bean.*;
import com.wipro.sales.util.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class SalesDao {
	
	Connection conn;
	
	public int insertSales(Sales sales) throws SQLException{
		
		PreparedStatement pstmt = null;
		conn = DBUtil.getDBConnection();
		
		
		java.sql.Date d = new java.sql.Date(sales.getSalesDate().getTime());
		
		String sql = "INSERT INTO TBL_SALES VALUES(?, ?, ?, ?, ?)";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sales.getProductID());
			pstmt.setDate(2, d);
			pstmt.setString(3, sales.getProductID());
			pstmt.setInt(4,sales.getQuantitySold());
			pstmt.setDouble(5,sales.getSalesPricePerUnit());
			
			if(pstmt.executeUpdate() == 1)
				return 1;
			else
				return 0;
			
		}catch(Exception e){
			System.out.println(e);
			return 0;
		}
		
	}
	
	
	
	public String generateSalesID(Date salesDate){
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT SEQ_SALES_ID.NEXTVAL FROM DUAL";
		
		int SEQ_SALES_ID = 0;
		String out = salesDate.toString().substring(salesDate.toString().length()-2, salesDate.toString().length());
		
		try{
			conn = DBUtil.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			SEQ_SALES_ID = rs.getInt(1);
			
			out = out + SEQ_SALES_ID;
			return out;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	public ArrayList<SalesReport> getSalesReport(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM V_SALES_REPORT";
		
		
		
		ArrayList<SalesReport> al = new ArrayList<SalesReport>();
		try{
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				SalesReport salesReport = new SalesReport();
				
				salesReport.setSalesID(rs.getString(1));
				salesReport.setSalesDate(rs.getDate(2));
				salesReport.setProductID(rs.getString(3));
				salesReport.setProductName(rs.getString(4));
				salesReport.setQuantitySold(rs.getInt(5));
				salesReport.setProductUnitPrice(rs.getDouble(6));
				salesReport.setSalesPricePerUnit(rs.getDouble(7));
				salesReport.setProfitAmount(rs.getDouble(8));
				al.add(salesReport);
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return al;
		
	}
}
