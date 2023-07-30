package com.tutorial.api.lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LombokService {

    @Autowired
    public StudentValue studentValue;

    //Creation of StudentValue Object
    public void studentValueObject(int id, String userName)
    {
        StudentValue studentValue = new StudentValue(id,userName);
        System.out.println(studentValue.getUsername());


//        studentValue = new StudentValue(5,"ABC");
        System.out.println(studentValue.getUsername());
    }
}