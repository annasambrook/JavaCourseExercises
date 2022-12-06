package com.anna.entity;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private String detailId;
	private int customerId;
	private int shareId;
	private String shareType;
	private int quantity;
}
