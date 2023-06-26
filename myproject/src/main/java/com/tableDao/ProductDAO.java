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
	
	public List<Product> getAllProduct( Integer productID ){
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
			ResultSet resultSet = statement.executeQuery("select  * from PRODUCT where product_ID = '" + productID +"';");
			if(resultSet.next()) {
				//resultSet.getInt(0);
				System.out.println(resultSet.getInt(1));
			}
		} catch (SQLException f) {
			Messagebox.show(f.toString());
		}
		return  null;
	}
}
