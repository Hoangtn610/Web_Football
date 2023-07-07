package com.tableData;

public class ProductPicture {
	private Long productID;
	private String URL1;
	private String URL2;
	private String URL3;
	
	public ProductPicture() {
	}
	
	public ProductPicture(Long productID, String uRL1, String uRL2, String uRL3) {
		this.productID = productID;
		this.URL1 = uRL1;
		this.URL2 = uRL2;
		this.URL3 = uRL3;
	}
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public String getURL1() {
		return URL1;
	}
	public void setURL1(String uRL1) {
		URL1 = uRL1;
	}
	public String getURL2() {
		return URL2;
	}
	public void setURL2(String uRL2) {
		URL2 = uRL2;
	}
	public String getURL3() {
		return URL3;
	}
	public void setURL3(String uRL3) {
		URL3 = uRL3;
	}
	
}
