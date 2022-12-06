package com.amal.Share_Service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="shares")
public class Share {
	
    @Id
    private int shareID;
    private int marketPrice;
    private String shareName;
}
