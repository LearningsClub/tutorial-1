package com.tutorial.api.lombok;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class RequiredArgsConstructorModule {
    @Id
    private final int id;
    private final String username;

}
