package com.tutorial.api.lombok;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class AllArgsConstructorModule {
    @Id
    private int id;
    private String username;

}
