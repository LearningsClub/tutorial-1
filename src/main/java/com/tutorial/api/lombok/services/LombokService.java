package com.tutorial.api.lombok.services;

import com.tutorial.api.lombok.modules.*;
import com.tutorial.api.lombok.pojo.StudentPojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.sound.midi.SysexMessage;

@Service
@Slf4j
public class LombokService {

    // Creation of StudentValue Object
    public StudentValue saveV(@RequestBody StudentPojo studentPojo) {

        log.info("Inside studentValueObject method");

        // Implementation of AllArgsConstructor of @Value annotation
        StudentValue studentValue = new StudentValue(studentPojo.getId(),studentPojo.getFirstName(),studentPojo.getLastName(),studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());

        // There is no method available for Updating the studentValue Object
        return studentValue;
    }
    public StudentAllArgsConstructor saveA(@RequestBody StudentPojo studentPojo)
    {
        // Showcase of All Arguments Constructor
        return new StudentAllArgsConstructor(studentPojo.getId(),studentPojo.getFirstName(),studentPojo.getLastName(),studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());
    }
    public int saveD(@RequestBody StudentPojo studentPojo)
    {
        // Implementation of NoArgsConstructor of @Data
        StudentData studentData = new StudentData();

        // Implementation of Setters of @Data
        studentData.setId(studentPojo.getId());
        studentData.setFirstName(studentPojo.getFirstName());
        studentData.setLastName(studentPojo.getLastName());
        studentData.setRollNo(studentPojo.getRollNo());
        studentData.setMathsScore(studentData.getMathsScore());
        studentData.setScienceScore(studentData.getScienceScore());
        studentData.setEnglishScore(studentPojo.getEnglishScore());

        // Implementation of toString of @Data.
        String toString = studentData.toString();
        System.out.println(toString);

        // Implementation of hashCode of @Data.
        return studentData.hashCode();
    }

    public StudentGetterAndSetter saveGS(StudentPojo studentPojo) {

        // Showcase of Getter and Setter Methods
        StudentGetterAndSetter getterAndSetter = new StudentGetterAndSetter();
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
        StudentToString studentToString = new StudentToString(studentPojo.getId(),studentPojo.getFirstName(),studentPojo.getLastName(),studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());
        // Showcase of toString Method
        return studentToString.toString();
    }

//    public String saveB(StudentPojo studentPojo)
//    {
//        StudentBuilder studentBuilder;
//        return "";
//    }

    public StudentRequiredArgsConstructor saveRAC(StudentPojo studentPojo)
    {
        // Here you can see that we haven't put Student's Last Name here because that variable wasn't final.
        return new StudentRequiredArgsConstructor(studentPojo.getId(), studentPojo.getFirstName(), studentPojo.getRollNo(),studentPojo.getMathsScore(),studentPojo.getScienceScore(),studentPojo.getEnglishScore());
    }
}