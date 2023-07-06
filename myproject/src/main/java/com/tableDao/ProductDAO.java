package com.tableDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.zkoss.zul.Messagebox;

import com.tableData.Product;

public class ProductDAO {

	private List<Product> productList;

	public ProductDAO() {
	}
	
	public List<Product> getAllProduct(){
		productList = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Setup the connection with the DB
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoang", "root",
					"hoangvnpro123@@");
			
			// Statements allow to issue SQL queries to the database ; that's why we need to create one.
			Statement statement = con.createStatement();
			
			// check data username
			ResultSet resultSet = statement.executeQuery("select  * from PRODUCT;");
			while(resultSet.next()) {
				//resultSet.getInt(0);
				System.out.println(resultSet.getInt(1));
				productList.add(new Product(resultSet.getLong(1),
						resultSet.getString(2),
						resultSet.getDouble(3), 
						resultSet.getInt(4),
						resultSet.getLong(5),
						resultSet.getLong(6),
						resultSet.getString(7),
						resultSet.getString(8)));
			}
		} catch (SQLException f) {
			Messagebox.show(f.toString());
		}
		return productList;
	}
	public Product getProductbyProductID (String productID) {
		Product product = new Product();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Setup the connection with the DB
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoang", "root",
					"hoangvnpro123@@");
			
			// Statements allow to issue SQL queries to the database ; that's why we need to create one.
			Statement statement = con.createStatement();
			
			// check data username
			ResultSet resultSet = statement.executeQuery("select  * from PRODUCT where product_id =" + productID + ";");
			while(resultSet.next()) {
				//resultSet.getInt(0);
				product = new Product(resultSet.getLong(1),
						resultSet.getString(2),
						resultSet.getDouble(3), 
						resultSet.getInt(4),
						resultSet.getLong(5),
						resultSet.getLong(6),
						resultSet.getString(7),
						resultSet.getString(8));
			}
		} catch (SQLException f) {
			Messagebox.show(f.toString());
		}
		return product;
		
	}
}
