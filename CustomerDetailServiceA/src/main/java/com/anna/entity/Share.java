package com.anna.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Share {

    private int shareID;
    private int marketPrice;
    private String shareName;
}
