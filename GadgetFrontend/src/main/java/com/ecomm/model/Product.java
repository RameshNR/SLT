package com.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product 
	{
	  @Id
	  @GeneratedValue
	  int productId;
	  
	  String productName;
	 

}
