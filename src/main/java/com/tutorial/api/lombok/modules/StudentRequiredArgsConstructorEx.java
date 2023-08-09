package com.tutorial.api.lombok.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class StudentRequiredArgsConstructorEx {
    @Id
    private final int id;
    private final String firstName;
    private String lastName;
    private final int rollNo;
    private final int mathsScore;
    private final int scienceScore;
    private final int englishScore;
}
