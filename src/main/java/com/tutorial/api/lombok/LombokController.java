package com.tutorial.api.lombok;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;


@RestController
public class LombokController {

    @Autowired
    public LombokService lombokService;
    @PostMapping("/StudentValue")
    public void objSet(@RequestParam int id, @RequestParam String userName)
    {
        lombokService.studentValueObject(id,userName);
    }
}
