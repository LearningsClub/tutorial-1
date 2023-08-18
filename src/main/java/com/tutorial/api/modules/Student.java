package com.tutorial.api.modules;

import com.tutorial.api.annotations.NotBlank;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Getter
    private String name;
    @Column(name = "roll_no", nullable = false)
    private long rollNo;

    @ManyToOne()
    @JoinColumn(name = "cities_id")
    private City city;

    @OneToOne(mappedBy = "student")
    private Passport passport;

    @ManyToMany
    @JoinTable(name = "students_courses", joinColumns = @JoinColumn(name = "students_id"), inverseJoinColumns = @JoinColumn(name = "courses_id"))
    private List<Course> courses;

    @OneToOne(mappedBy = "student")
    private Payment payment;
}