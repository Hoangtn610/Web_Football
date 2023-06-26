package com.tableData;

public class Product {
	private Long productID;
	private String productName;
	private Double price;
	private Integer sale;
	private Long quantityInStock;
	private Long sold;
	private String madeIn;
	private String imagePath;
	
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Product() {
		
	}

	public Product(Long productID, String productName, Double price, Integer sale, Long quantityInStock,
			Long sold, String madeIn, String imagePath) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.sale = sale;
		this.quantityInStock = quantityInStock;
		this.sold = sold;
		this.madeIn = madeIn;
		this.imagePath = imagePath;
	}
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getSale() {
		return sale;
	}
	public void setSale(Integer sale) {
		this.sale = sale;
	}
	public Long getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(Long quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public Long getSold() {
		return sold;
	}
	public void setSold(Long sold) {
		this.sold = sold;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
}
