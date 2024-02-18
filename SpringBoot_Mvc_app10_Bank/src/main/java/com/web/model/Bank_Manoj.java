package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bank_Manoj {
	@Id
	private int accountnumber;
	private String name;
	private int password;
	private double amount;
	private String address;
	private long mobileno;
	private String ifsccode;
	private int brcode;
	private int status;
 	
	
	
	
}
