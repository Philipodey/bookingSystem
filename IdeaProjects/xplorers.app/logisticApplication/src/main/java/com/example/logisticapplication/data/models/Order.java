package com.example.logisticapplication.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Order {
    @Id
    private String orderId;
    private String customerId;
    private String orderType;
    private String orderNumber;
    private String orderDescription;

}
