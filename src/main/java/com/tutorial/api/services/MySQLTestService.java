package com.tutorial.api.services;

import com.tutorial.api.modules.TestModule;
import com.tutorial.api.repositories.TestRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySQLTestService {
//    private static final Logger log = LoggerFactory.getLogger(MySQLTestService.class);

    @Autowired
    public TestRepo testRepository;

    public String save(TestModule testModule)
    {
//        log.info("TestModule data saving initiated");
        testRepository.save(testModule);
        return "MySQL Tested Successfully";
    }
}
