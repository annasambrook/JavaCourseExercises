package com.anna.entity;

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
//@Table(name = "appUsers")
public class User {

	@Id
	@Column(name = "accountId")
	private String userName;
	
	@Column(name = "customerPassword")
	private String password;
	
	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phoneNumber")
	private int phoneNumber;
	
	@Column(name = "bankBalance")
	private double bankBalance;
}
