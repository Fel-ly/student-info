package com.example.myapplication;

public class Course {
    //
    public String name;
    public String department;

    public Course(String name) {
        this.name = name;
    }

    Course(String name, String department){
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
