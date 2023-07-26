package com.tutorial.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate template;

    @PostMapping("/redisTest")
    public String save(String testKey, String testValue)
    {
        template.opsForValue().set(testKey, testValue);
        return "Redis Tested";
    }
}
