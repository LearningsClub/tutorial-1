package com.tutorial.api.lombok.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentData {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int rollNo;
    private int mathsScore;
    private int scienceScore;
    private int englishScore;
}
