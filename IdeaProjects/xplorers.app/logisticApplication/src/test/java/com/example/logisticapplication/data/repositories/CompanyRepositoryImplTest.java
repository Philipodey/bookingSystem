package com.example.logisticapplication.data.repositories;

import com.example.logisticapplication.data.models.Company;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CompanyRepositoryImplTest {
    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void saveNameTest(){
        companyRepository.deleteAll();
        Company company = new Company();
        Company savedCompany = companyRepository.save(company);
        assertEquals(1, companyRepository.count());
    }

}
