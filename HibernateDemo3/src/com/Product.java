package com;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name= "Store1")
public class Product {

	@Id
	@Column(name="Product_ID", nullable=false)
	int productId;
	
	@Column(name="Product_Name", nullable=false)
	String productName;
	
	@Column(name="Model_Name", nullable=false)
	String model;
	
	@Column(name="Product_Price", nullable=false)
	int price;
	

	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
