package com.example.logisticapplication.data.repositories;

import com.example.logisticapplication.data.models.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {

}
