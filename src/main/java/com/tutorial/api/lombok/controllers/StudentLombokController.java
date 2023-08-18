package com.tutorial.api.lombok.controllers;

import com.tutorial.api.lombok.annotations.FirstAnno;
import com.tutorial.api.lombok.modules.*;
import com.tutorial.api.lombok.pojo.StudentPojo;
import com.tutorial.api.lombok.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/Student")
@FirstAnno(number = 10, gender = "Male", myName = "Preetam")
public class StudentLombokController {
    @Autowired
    public StudentService studentService;

    // API to demonstrate @AllArgsConstructor Annotation
    @PostMapping("/AllArgsConstructor")
    public StudentAllArgsConstructorEx saveA(@RequestBody StudentPojo studentPojo)
    {
        return studentService.saveA(studentPojo);
    }

    // API to demonstrate @Builder Annotation
    @PostMapping("/Builder")
    public StudentBuilderEx saveB(@RequestBody StudentPojo studentPojo) {
        return studentService.saveB(studentPojo);
    }

    // API to demonstrate @Data Annotation
    @PostMapping("/Data")
    public int saveD(@RequestBody StudentPojo studentPojo) {
        return studentService.saveD(studentPojo);
    }

    // API to demonstrate @Builder Annotation
    @PostMapping("/GetterAndSetter")
    public StudentGetterAndSetterEx saveGS(@RequestBody StudentPojo studentPojo) {
        return studentService.saveGS(studentPojo);
    }

    // API to demonstrate @Builder Annotation
    @PostMapping("/RequiredArgsConstructor")
    public StudentRequiredArgsConstructorEx saveRAC(@RequestBody StudentPojo studentPojo) {
        return studentService.saveRAC(studentPojo);
    }

    @PostMapping("/ToString")
    public String saveTS(@RequestBody StudentPojo studentPojo) {
        return studentService.saveTS(studentPojo);
    }

    @PostMapping("/Value")
    public StudentValueEx saveV(@RequestBody StudentPojo studentPojo) {
        return studentService.saveV(studentPojo);
    }


}
