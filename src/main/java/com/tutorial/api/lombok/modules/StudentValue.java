package com.tutorial.api.lombok.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Value;

@Entity
@Value
public class StudentValue {
    @Id
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int rollNo;
    private final int mathsScore;
    private final int scienceScore;
    private final int englishScore;
}
