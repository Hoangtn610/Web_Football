package com.tableDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.zkoss.zul.Messagebox;

import com.tableData.ProductPicture;

public class ProductPictureDAO {
	public ProductPicture getProducPicturebyProductID (String productID) {
		ProductPicture productPic = new ProductPicture();
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
			ResultSet resultSet = statement.executeQuery("select  * from PRODUCT_PICTURE where product_id =" + productID + ";");
			while(resultSet.next()) {
				//resultSet.getInt(0);
				productPic = new ProductPicture(resultSet.getLong(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4));
			}
		} catch (SQLException f) {
			Messagebox.show(f.toString());
		}
		return productPic;
		
	}
}
