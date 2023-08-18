package com.tutorial.api.controllers.connectionTester;

import com.tutorial.api.dto.StudentDTO;
import com.tutorial.api.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    public StudentRepo studentRepo;
    @GetMapping("/test")
    public String test()
    {
        return "Successful";
    }

    @GetMapping("/tttt")
    public List<StudentDTO> createStudent() throws NoSuchFieldException, NullPointerException {
        // Logic to create Student
        return studentRepo.findAllStudentPair();
//        List<StudentCityPair> studentCityPairList = new ArrayList<>();
//
//        for (Object result : resultList) {
//            if (result instanceof Object[]) {
//
//                StudentCityPair studentCityPair = new StudentCityPair();
//                Object[] row = (Object[]) result;
//
//                String studentName = (String) row[0];
//                String cityName = (String) row[1];
//
//                studentCityPair.setStudentName(studentName);
//                studentCityPair.setCityName(cityName);
//
//                studentCityPairList.add(studentCityPair);
//            }
//        }
//        return studentCityPairList;
    }
}