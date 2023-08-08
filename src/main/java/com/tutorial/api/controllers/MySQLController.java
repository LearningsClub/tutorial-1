package com.tutorial.api.controllers;

import com.tutorial.api.modules.TestModule;
import com.tutorial.api.services.MySQLTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySQLController {

    // adding some test comments
    // some more comments
    @Autowired
    public MySQLTestService mySQLTestService;
    @PostMapping("/MySQL")
    public String test(@RequestBody TestModule testModule)
    {
        return  mySQLTestService.save(testModule);
    }
}
