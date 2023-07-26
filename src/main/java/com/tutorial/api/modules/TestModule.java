package com.tutorial.api.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestModule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String test;

    public TestModule() {
    }

    public TestModule(int id, String test) {
        this.id = id;
        this.test = test;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
