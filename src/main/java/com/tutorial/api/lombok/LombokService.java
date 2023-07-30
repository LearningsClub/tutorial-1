package com.tutorial.api.lombok;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
public class LombokService {

    // Creation of StudentValue Object
    public void studentValueObject(int id, String userName) {

        log.info("Inside studentValueObject method"");

        StudentValue studentValue = new StudentValue(id, userName);
        System.out.println(studentValue.getUsername());

        studentValue = new StudentValue(5, "ABC");
        System.out.println(studentValue.getUsername());

        studentValue = new StudentValue(6, "ABC1");
        System.out.println(studentValue.getUsername());

    }
}