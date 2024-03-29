package com.wipro.sales.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wipro.sales.bean.*;
import com.wipro.sales.util.DBUtil;

public class StockDao {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public int insertStock(Stock sales){
		String sql = "INSERT INTO TBL_STOCK VALUES(?, ?, ?, ?, ?)";
		
		try{
			conn = DBUtil.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,sales.getProductID());
			pstmt.setString(2,sales.getProductName());
			pstmt.setInt(3,sales.getQuantityOnHand());
			pstmt.setDouble(4,sales.getProductUnitPrice());
			pstmt.setInt(5,sales.getReorderLevel());
			
			if(pstmt.executeUpdate() == 1)
				return 1;
			else
				return 0;
			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	public String generateProductID(String productName){
		String sql = "SELECT SEQ_PRODUCT_ID.NEXTVAL FROM DUAL";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int SEQ_PRODUCT_ID = 0;
		String out = "";
		
		try{
			conn = DBUtil.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			SEQ_PRODUCT_ID = rs.getInt(1);
			
			out += productName.substring(0,2);
			out += SEQ_PRODUCT_ID;
			
			return out;			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}
	
	public int updateStock(String productID, int soldQty){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TBL_STOCK SET Quantity_On_Hand = Quantity_On_Hand - ?"+ "WHERE Product_ID = ?";
		
				try{
					conn = DBUtil.getDBConnection();
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, soldQty);
					pstmt.setString(2,productID);
					
					if(pstmt.executeUpdate() == 1)
						return 1;
					else return 0;
					
				}catch(Exception e){
					e.printStackTrace();
					return 0;
				}
	}
	
	public Stock getStock(String productID){
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "";
		
		try{
			conn = DBUtil.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productID);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			Stock stock = new Stock();
			stock.setProductID(rs.getString(1));
			stock.setProductName(rs.getString(2));
			stock.setQuantityOnHand(rs.getInt(3));
			stock.setProductUnitPrice(rs.getDouble(4));
			stock.setReorderLevel(rs.getInt(5));
			
			return stock;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
	
	public int deleteStock(String productID){
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE TBL_STOCK WHERE Product_ID = ?";
		
		try {
			conn = DBUtil.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productID);
			
			if (pstmt.executeUpdate() == 1) 
				return 1;
			else 
				return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
