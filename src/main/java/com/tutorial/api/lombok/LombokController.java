package com.tutorial.api.lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LombokController {

    @Autowired
    public LombokService lombokService;

    @PostMapping("/StudentValue")
    public void objSet(@RequestParam int id, @RequestParam String userName) {
        lombokService.studentValueObject(id, userName);
    }
}
