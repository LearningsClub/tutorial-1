package com.tutorial.api.lombok.services;

import com.tutorial.api.lombok.modules.*;
import com.tutorial.api.lombok.pojo.StudentPojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Slf4j
public class StudentService {

    // Creation of StudentValue Object
    public StudentValueEx saveV(@RequestBody StudentPojo studentPojo) {

        log.info("Inside studentValueObject method");

        // Implementation of AllArgsConstructor of @Value annotation
        StudentValueEx studentValueEx = new StudentValueEx(studentPojo.getId(),studentPojo.getFirstName(),studentPojo.getLastName(),studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());

        // There is no method available for Updating the studentValue Object
        return studentValueEx;
    }
    public StudentAllArgsConstructorEx saveA(@RequestBody StudentPojo studentPojo)
    {
        // Showcase of All Arguments Constructor
        return new StudentAllArgsConstructorEx(studentPojo.getId(),studentPojo.getFirstName(),studentPojo.getLastName(),studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());
    }
    public int saveD(@RequestBody StudentPojo studentPojo)
    {
        log.info("saveD function execution begins");

        // Implementation of NoArgsConstructor of @Data
        StudentDataEx studentDataEx = new StudentDataEx();
        log.info("StudentData Object Created");

        // Implementation of Setters of @Data
        studentDataEx.setId(studentPojo.getId());
        studentDataEx.setFirstName(studentPojo.getFirstName());
        studentDataEx.setLastName(studentPojo.getLastName());
        studentDataEx.setRollNo(studentPojo.getRollNo());
        studentDataEx.setMathsScore(studentDataEx.getMathsScore());
        studentDataEx.setScienceScore(studentDataEx.getScienceScore());
        studentDataEx.setEnglishScore(studentPojo.getEnglishScore());

        log.info("Data Set to StudentData Object");

        // Implementation of toString of @Data.
        String toString = studentDataEx.toString();
        System.out.println(toString);

        // Implementation of hashCode of @Data.
        return studentDataEx.hashCode();
    }

    public StudentGetterAndSetterEx saveGS(StudentPojo studentPojo) {

        // Showcase of Getter and Setter Methods
        StudentGetterAndSetterEx getterAndSetter = new StudentGetterAndSetterEx();
        getterAndSetter.setId(studentPojo.getId());
        getterAndSetter.setFirstName(studentPojo.getFirstName());
        getterAndSetter.setLastName(studentPojo.getLastName());
        getterAndSetter.setRollNo(studentPojo.getRollNo());
        getterAndSetter.setEnglishScore(studentPojo.getEnglishScore());
        getterAndSetter.setMathsScore(studentPojo.getMathsScore());
        getterAndSetter.setScienceScore(studentPojo.getScienceScore());

        return getterAndSetter;
    }

    public String saveTS(StudentPojo studentPojo)
    {
        StudentToStringEx studentToStringEx = new StudentToStringEx(studentPojo.getId(),studentPojo.getFirstName(),studentPojo.getLastName(),studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());
        // Showcase of toString Method
        return studentToStringEx.toString();
    }

    public StudentBuilderEx saveB(StudentPojo studentPojo)
    {
        StudentBuilderEx studentBuilderEx = StudentBuilderEx.builder()
                .id(studentPojo.getId())
                .firstName(studentPojo.getFirstName())
                .lastName(studentPojo.getLastName())
                .rollNo(studentPojo.getRollNo())
                .mathsScore(studentPojo.getMathsScore())
                .scienceScore(studentPojo.getScienceScore())
                .englishScore(studentPojo.getEnglishScore())
                .build();

        return studentBuilderEx;
    }

    public StudentRequiredArgsConstructorEx saveRAC(StudentPojo studentPojo)
    {
        // Here you can see that we haven't put Student's Last Name here because that variable wasn't final.
        return new StudentRequiredArgsConstructorEx(studentPojo.getId(), studentPojo.getFirstName(), studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());
    }
}