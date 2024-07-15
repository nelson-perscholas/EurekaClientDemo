package com.nchang.EurekaClientDemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Student {
    private  int id;
    private String name;
    private String className;

    public Student(String name, String className) {
        super();
        this.name = name;
        this.className = className;
    }
}