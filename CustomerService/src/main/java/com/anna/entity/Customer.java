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
@Table(name = "customer")
public class Customer {

	
	@Id
	@Column(name ="detailId")
	String detailId;
	
	@Column(name ="customerId")
	int customerId;
	
	@Column(name ="shareId")
	int shareId;
	
	@Column(name ="shareType")
	String shareType;
	
	@Column(name ="quantity")
	int quantity;
}
