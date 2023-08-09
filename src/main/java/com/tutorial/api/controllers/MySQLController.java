package com.tutorial.api.controllers;

import com.tutorial.api.modules.TestModule;
import com.tutorial.api.services.MySQLTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySQLController {
    @Autowired
    public MySQLTestService mySQLTestService;

    @PostMapping("/testMySQL")
    public String test(@RequestBody TestModule testModule) {
        return mySQLTestService.save(testModule);
    }
}
