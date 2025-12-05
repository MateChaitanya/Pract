package com.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component   // makes this class a spring bean
public class Student {

    @Value("Chaitanya")   //inject value directly
    private String name;

    @Value("22")
    private int age;

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
