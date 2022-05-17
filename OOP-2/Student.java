package com.company;

import java.util.ArrayList;

public class Student {

    private String id;
    private String name;
    private int age;
    String phoneNumber;
    private int height;
    static String schoolName="KFUPM";
    private ArrayList<String> classList;

    public Student(String id , String name, int age,int height) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.height=height;
        classList=new ArrayList<>();
    }

    public void setAge(int age){
        schoolName="12321";
        if(age >=18){
            this.age=age;
        }
    }

    public int getAge() {
        return age;
    }

    public void addClass(String className){
        classList.add(className);
    }
    public void removeClass(int index){
        classList.remove(index);
    }
    public void editClass(int index, String className){
        classList.set(index,className);
    }
    public ArrayList<String> getClassList(){
        return classList;
    }
    public static void changeSchoolName(String name){
        // addClass("Math");
        System.out.println(schoolName);
    }

}
