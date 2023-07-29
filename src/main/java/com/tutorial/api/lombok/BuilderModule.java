package com.tutorial.api.lombok;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
@Builder
public class BuilderModule {
    @Id
    private int id;
    private String username;
}
