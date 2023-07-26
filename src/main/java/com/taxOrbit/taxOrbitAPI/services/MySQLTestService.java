package com.taxOrbit.taxOrbitAPI.services;

import com.taxOrbit.taxOrbitAPI.modules.TestModule;
import com.taxOrbit.taxOrbitAPI.repositories.TestRepo;
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
