package com.tutorial.api.controllers;

import com.tutorial.api.annotations.NotBlank;
import com.tutorial.api.annotations.Validated;
import com.tutorial.api.annotations.ValidatedInput;
import com.tutorial.api.modules.City;
import com.tutorial.api.modules.Student;
import com.tutorial.api.repositories.CityRepo;
import com.tutorial.api.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ValidatedInput
public class AnnotationExampleController {
    @Autowired
    public StudentRepo studentRepo;
    @Autowired
    public CityRepo cityRepo;
    @NotBlank
    private String username;
    @NotBlank
    private long rollNo;
    @NotBlank
    private long cities_id;
    @Validated
    public void createStudent(String username, long rollNo, long cities_id) {

        Student student = new Student();
        student.setName(username);
        student.setRollNo(rollNo);
        City city =  cityRepo.getReferenceById(cities_id);
        student.setCity(city);

        studentRepo.save(student);
    }
}