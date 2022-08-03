package com.company;

public class Teacher {

    String name;
    int age;
    String id;
    String phoneNumber;
    int salary;

    public Teacher(String name, int age, String id, String phoneNumber, int salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Course createCourse(String name,String courseId){
        return new Course(name,courseId);
    }




}
