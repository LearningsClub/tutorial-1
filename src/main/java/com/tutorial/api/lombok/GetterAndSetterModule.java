package com.tutorial.api.lombok;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class GetterAndSetterModule {

    @Id
    private int id;
    private String username;
}
