package com.tutorial.api.repositories;

import com.tutorial.api.modules.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepo extends JpaRepository<Course,Long> {
    @Query(value = "SELECT id FROM courses WHERE courses.name =:courseName", nativeQuery = true)
    Long getIdByCourseName(String courseName);
}
