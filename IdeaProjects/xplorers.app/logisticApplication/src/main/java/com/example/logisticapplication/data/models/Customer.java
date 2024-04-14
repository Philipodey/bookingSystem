package com.example.logisticapplication.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Customer {
    @Id
    private Long customerId;
    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private String customerUsername;
    private String customerPassword;
    private String Address;
}
