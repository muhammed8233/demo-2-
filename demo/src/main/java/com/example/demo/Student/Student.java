package com.example.demo.Student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private  String name;
    private String email;
    private LocalDate dob;
    private int age;

    public Student(){

    }
    public Student(int age, String name, Long id,
                   String email, LocalDate dob) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.email = email;
        this.dob = dob;
    }

    public Student(int age, LocalDate dob,
                   String email, String name) {
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
