package com.example.logisticapplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {
    @Id
    private String productId;
    private String productItem;
    private String customerId;
    private String productNumber;
    private String productType;
    private String productDescription;

}
