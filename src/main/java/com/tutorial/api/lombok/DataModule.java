package com.tutorial.api.lombok;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DataModule {
    @Id
    private int id;
    private String username;
}
