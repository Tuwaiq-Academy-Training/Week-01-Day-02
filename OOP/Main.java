package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Types of errors in programming
        //  1- Syntax error
        //  2- Runtime error
        //  3- Logical error

        // < Datatype > < name > = < value >

//        name int = 5;
//        for {
//            int i=0;
//            i++;
//            i<5;
//
//        }
//        public static  void main2(){
//
//        }

//        int number1= 10;
//        int number2=0;

        // System.out.println(number1/number2);

//        int arr[]={1,2,3};
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println("Hey from main");

        //     System.out.println(sum(10,5));


        // Runtime error

//        int number1= 10;
//        int number2=2;
//        int arr[]={5,6,7};
//        try {
//            System.out.println(number1 / number2);
//            System.out.println("Hey from try");
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
//            System.out.println("Hey from catch");
//        } finally {
//            System.out.println("Hey from finally");
//        }


        // Throw : Self causing runtime error


//        try {
//            System.out.println(tax(90));
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }
//
//        System.out.println("Hey from main");
//
//
//        System.out.println(tax(90));

        //
        int number = 10;



//           try {
//               System.out.println("Hey from try");
//               throw new Exception("Try exception");
//               System.out.println("End of try");
//           }catch (Exception e){
//               e.printStackTrace();
//           }


        // Programming paradigms
        // 1- Procedural programming

        String role="user";

        if(role=="admin"){
            System.out.println("Welcome admin");
        }else if(role=="superuser"){
            System.out.println("Welcome superuser");
        }else {
            System.out.println("Welcome User");
        }

        Teacher teacher=new Teacher("Saleh",23,"123","055555",999999999);
        Course course1=teacher.createCourse("Math","123");
        Course course2=teacher.createCourse("Java","578");

        Student student1=new Student("Ali",20,"5777","05555");
        Student student2=new Student("Khalid",19,"21361","05555");

        student1.addCourse(course1);
        student2.addCourse(course2);

        student1.name="kahlid";

        student1.setName("kahlid");

        System.out.println(student1.getName());







//        ArrayList studentList=new ArrayList();
//
//        // OOP
//        Student student1=new Student("Khalid",23,"12345","055555555");
//        student1.addCourse("Math");
//        student1.addCourse("CS");
//        System.out.println("Saleh Course list : ");
//        student1.printCourseList();
//        studentList.add(student1);
//
//        Student student2=new Student("Ali",50,"123","055555554");
//
//        Course course1=new Course("Math","1234");
//        Course course2=new Course("Math","1234");
//        student2.addCourse(course1);
//        student2.addCourse(course2);
//        System.out.println("Ali Course list  1 : ");
//        student2.printCourseList();
//        student2.removeCourse("Java");
//        System.out.println("Ali Course list  2 : ");
//        student2.printCourseList();
//        studentList.add(student2);













    }

    public static int tax(int price) throws Exception  {

        if (price < 100 || price > 500) {
            throw new Exception("Price must be between 100 & 500");
        }
        return price * 15 / 100;
    }


    public static int sum(int number1, int number2) {
        return number1 / number2;
    }


    public static int div(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Don't div by zero");
        }
        return number1 / number2;
    }
}



