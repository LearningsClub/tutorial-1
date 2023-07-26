package com.taxOrbit.taxOrbitAPI.controllers;

import com.taxOrbit.taxOrbitAPI.modules.TestModule;
import com.taxOrbit.taxOrbitAPI.services.MySQLTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySQLTestController {

    @Autowired
    public MySQLTestService mySQLTestService;
    @PostMapping("/testMySQL")
    public String test(@RequestBody TestModule testModule)
    {
        return  mySQLTestService.save(testModule);
    }
}
