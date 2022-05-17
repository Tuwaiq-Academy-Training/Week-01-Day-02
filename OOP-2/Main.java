package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Student student=new Student("123c","saleh",23,170);
      student.addClass("Math");
      student.addClass("CS");
       // System.out.println("Student 1 : "+student.getClassList());
      Student student2=new Student("435C","ali",30,150);
      student2.addClass("English");
      student2.addClass("History");
       // System.out.println("Student 2 : "+student2.getClassList());
       //        System.out=null;
      student.setAge(80);
        //System.out.println(student.getAge());

        // System.out.println(Student.schoolName);


//      String name="saleh";
//      String name2= new String("saleh");


    //    Math m =new Math();
//
    }

    public static int sum(int number1,int number2){
      return number1+number2;
    }
}


