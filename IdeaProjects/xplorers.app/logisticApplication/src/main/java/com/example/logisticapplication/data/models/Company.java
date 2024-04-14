package com.example.logisticapplication.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Company {
    @Id
    private String companyId;
    private String companyName;
    private String address;
}
