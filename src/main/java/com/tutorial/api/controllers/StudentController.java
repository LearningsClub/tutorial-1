package com.tutorial.api.controllers;

import com.tutorial.api.dto.StudentDTO;
import com.tutorial.api.modules.Course;
import com.tutorial.api.modules.Student;
import com.tutorial.api.modules.projections.StudentNames;
import com.tutorial.api.repositories.CourseRepo;
import com.tutorial.api.repositories.PaymentRepo;
import com.tutorial.api.repositories.StudentRepo;
import jakarta.transaction.Transactional;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    public StudentRepo studentRepo;
    @Autowired
    public PaymentRepo paymentRepo;
    @Autowired
    public CourseRepo courseRepo;
    @GetMapping("/List")
    public List<StudentNames> listOfStudents()
    {
        return studentRepo.getStudentList();
    }

    @Transactional
    @PostMapping("/enrollStudent")
    public String enrollStudent(@NotNull @RequestBody Student student, @RequestParam String courseName) {
        Student newStudent = new Student();
        newStudent.setId(student.getId());
        newStudent.setName(student.getName());
        newStudent.setRollNo(student.getRollNo());
        newStudent.setCity(student.getCity());

        Course course = new Course();
        List<Course> courseList = new ArrayList<>();
        if(student.getCourses() == null)
        {
            course.setName(courseName);
            if(courseRepo.getIdByCourseName(courseName) == null)
            {
                courseRepo.save(course);
            }
            course.setId(courseRepo.getIdByCourseName(courseName));
            courseList.add(course);
        }
        else {
            courseList = student.getCourses();
        }
        newStudent.setCourses(courseList);

        boolean paymentSuccess = checkPayment(newStudent);

        if (!paymentSuccess) {
            throw new RuntimeException("Payment processing failed.");
        }
        studentRepo.save(newStudent);
        return "Enrollment and payment successful!";
    }
    private boolean checkPayment(Student student) {
        return paymentRepo.getPaymentStatus(student);
    }

    // Pagination and Sorting

    @GetMapping("/pagination")
    public Page<StudentDTO> getPaginatedAndSortedStudents(@RequestParam int pageNumber,@RequestParam int pageSize,@RequestParam String sortBy) {

        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
        return studentRepo.findAllStudentPair(pageable);
    }
}