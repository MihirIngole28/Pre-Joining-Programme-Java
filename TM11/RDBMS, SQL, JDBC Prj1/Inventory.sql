DROP TABLE TBL_STOCK;
DROP TABLE TBL_SALES;

CREATE TABLE TBL_STOCK 
    (Product_ID VARCHAR2(6),
    Product_Name VARCHAR(20),
    Quantity_On_Hand NUMBER(10),
    Product_Unit_Price NUMBER(10),
    Reorder_Level NUMBER(10),
    CONSTRAINT my_tbl_stock_pk PRIMARY KEY(Product_ID),
    CONSTRAINT my_prdct_name_uk UNIQUE(Product_Name),
    CONSTRAINT my_qnt_on_hand CHECK(Quantity_On_Hand >= 0),
    CONSTRAINT my_prdct_unit_prc CHECK(Product_Unit_Price >= 0),
    CONSTRAINT my_recdr_lvl CHECK(Reorder_Level >= 0)
);
    
CREATE TABLE TBL_SALES(
    Sales_ID VARCHAR(6),
    Sales_Date DATE,
    Product_ID VARCHAR(6),
    Quantity_Sold NUMBER(10),
    Sales_Price_Per_Unit NUMBER(10),
    CONSTRAINT my_sales_id_pk PRIMARY KEY(Sales_ID),
    CONSTRAINT my_prdct_id_fk FOREIGN KEY(Product_ID) REFERENCES TBL_STOCK(Product_ID),
    CONSTRAINT my_qty_sld CHECK(Quantity_Sold >= 0),
    CONSTRAINT my_sls_prc CHECK(Sales_Price_Per_Unit >= 0)
);

INSERT INTO TBL_STOCK VALUES('RE1001','REDMI Note 3',20,12000,5);
INSERT INTO TBL_STOCK VALUES('ip1002','Iphone 5S',10,21000,2);
INSERT INTO TBL_STOCK VALUES('PA1003','Panasonic P55',50,5500,5);

DROP SEQUENCE SEQ_SALES_ID;
DROP SEQUENCE SEQ_PRODUCT_ID;
CREATE SEQUENCE SEQ_SALES_ID START WITH 1000 INCREMENT BY 1;
CREATE SEQUENCE SEQ_PRODUCT_ID START WITH 1004 INCREMENT BY 1;

DROP VIEW V_SALES_REPORT;
CREATE VIEW V_SALES_REPORT AS
	SELECT Sales_ID, Sales_Date, Product_ID, Product_Name, 
			Quantity_Sold, Product_Unit_Price, Sales_Price_Per_Unit, 
			(Sales_Price_Per_Unit - Product_Unit_Price) Profit_Amount
	FROM TBL_STOCK NATURAL JOIN TBL_SALES
	ORDER BY Profit_Amount DESC, Sales_ID ASC;