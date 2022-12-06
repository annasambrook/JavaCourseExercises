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
	private String detailId;
	
	@Column(name ="customerId")
	private int customerId;
	
	@Column(name ="shareId")
	private int shareId;
	
	@Column(name ="shareType")
	private String shareType;
	
	@Column(name ="quantity")
	private int quantity;
}
