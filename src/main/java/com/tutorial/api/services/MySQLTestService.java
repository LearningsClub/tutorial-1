package com.tutorial.api.services;

import com.tutorial.api.modules.TestModule;
import com.tutorial.api.repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySQLTestService {
    @Autowired
    public TestRepo testRepository;

    public String save(TestModule testModule)
    {
        testRepository.save(testModule);
        return "MySQL Tested Successfully";
    }
}
