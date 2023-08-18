package com.tutorial.api.repositories;

import com.tutorial.api.dto.StudentDTO;
import com.tutorial.api.modules.Student;
import com.tutorial.api.modules.projections.StudentNames;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Long> {

    // NORMAL CUSTOM FETCH QUERY
    @Query("SELECT s FROM students s WHERE s.rollNo = :rollNo")
    Student findByRollNo(@Param("rollNo") long rollNo);

    // IMPLEMENTATION OF DTO IN JPA
    @Query("SELECT new com.tutorial.api.dto.StudentDTO(s.name, c.name) FROM students s INNER JOIN s.city c")
    List<StudentDTO> findAllStudentPair();

    // JOINS

    // INNER JOIN

//    @Query(value = "SELECT s.name, c.name FROM students s INNER JOIN s.city c")
//    List<Object> studentCityInner();

    @Query(value = "SELECT s.name, c.name FROM students s INNER JOIN cities c ON s.cities_id = c.id", nativeQuery = true)
    List<Object> studentCityInner();


    // LEFT JOIN

//    @Query("SELECT s.name, c.name FROM Student s LEFT JOIN s.cities c")
//    List<Object> studentCityLeft();

    @Query(value = "SELECT new StudentCityPair(s.name, c.name) FROM students s LEFT JOIN cities c ON s.cities_id = c.id", nativeQuery = true)
    List<StudentDTO> studentCityLeft();


    // RIGHT JOIN

//    @Query("SELECT s.name, c.name FROM cities c RIGHT JOIN c.studentList s")
//    List<Object> studentCityRight();
    @Query(value = "SELECT new StudentCityPair(s.name, c.name) FROM cities c RIGHT JOIN students s ON c.id = s.cities_id", nativeQuery = true)
    List<StudentDTO> studentCityRight();

    // OUTER JOIN

//    @Query(value = "SELECT s.name, c.name FROM Student s, City c")
//    List<Object> studentCityCross();
    @Query(value = "SELECT new StudentCityPair(s.name, c.name) FROM students s CROSS JOIN cities c", nativeQuery = true)
    List<StudentDTO> studentCityCross();

    // PROJECTION IMPLEMENTATION

//    Use of StudentList Projection
    @Query(value = "SELECT s.name AS name from students s")
    List<StudentNames> getStudentList();

    // Pagination and Sorting
    @Query("SELECT new com.tutorial.api.dto.StudentDTO(s.name, c.name) FROM students s INNER JOIN s.city c")
    Page<StudentDTO> findAllStudentPair(Pageable pageable);
}