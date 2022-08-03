package com.company;

import java.util.ArrayList;

public class Student {

    String name;
    int age;
    String id;
    String phoneNumber;
    ArrayList <Course>courseList=new ArrayList();

    public Student(String name, int age, String id, String phoneNumber) {
        Character firstChar=name.charAt(0);
        name=firstChar.toString().toUpperCase()+name.substring(1);
        this.name = name;
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void removeCourse(Course course){
        courseList.remove(course);
    }

    public void printCourseList() {
        System.out.println(courseList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
