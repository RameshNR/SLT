package com.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserDetails 
	{ 
	  @Id
	  String username;
	  String password;
	  
	  String customerName;
	  String role;
	  boolean enable;
	  String address;
	  

}
