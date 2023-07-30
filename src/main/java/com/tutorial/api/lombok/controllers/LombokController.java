package com.tutorial.api.lombok.controllers;

import com.tutorial.api.lombok.modules.StudentAllArgsConstructor;
import com.tutorial.api.lombok.modules.StudentValue;
import com.tutorial.api.lombok.pojo.StudentPojo;
import com.tutorial.api.lombok.services.LombokService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/Student")
public class LombokController {
    @Autowired
    public LombokService lombokService;

    // API to demonstrate @AllArgsConstructor Annotation
    @PostMapping("/AllArgsConstructor")
    public StudentAllArgsConstructor save(@RequestBody StudentPojo studentPojo)
    {
        return lombokService.saveA(studentPojo);
    }

    // API to demonstrate @Data Annotation
    @PostMapping("/Data")
    public int saveD(@RequestBody StudentPojo studentPojo)
    {
        return lombokService.saveD(studentPojo);
    }

    @PostMapping("/StudentValue")
    public StudentValue saveV(@RequestBody StudentPojo studentPojo)
    {
        return lombokService.saveV(studentPojo);
    }
}
