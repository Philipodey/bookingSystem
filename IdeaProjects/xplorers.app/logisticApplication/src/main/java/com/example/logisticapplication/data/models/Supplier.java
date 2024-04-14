package com.example.logisticapplication.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Supplier {
    @Id
    private String supplierId;
    private String supplierName;
    private String supplierMobile;
    private String supplierUsername;
    private String supplierPassword;
    private String supplierAddress;

}
