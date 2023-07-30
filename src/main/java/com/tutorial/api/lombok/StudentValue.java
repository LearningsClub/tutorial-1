package com.tutorial.api.lombok;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Value;

@Entity
@Value
public class StudentValue {
    @Id
    int id;
    String username;
}
