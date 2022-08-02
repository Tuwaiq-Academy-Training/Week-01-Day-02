package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        for (int i = 0; i < 9; i++) {
//            if(i==3){
//                break;
//            }
//          System.out.println("This is break " + i);
//        }

//        for (int i = 0; i < 9; i++) {
//            if(i==3){
//                continue;
//            }
//            System.out.println("This is continue " + i);
//        }



        // Array in java
        // < Datatype >  < name [] > = new < Datatype > < [ Length ] >
        String users[] = new String[3];
        users[0] = "Saleh";
        users[1]="Ali";
        users[2]="Khalid";

        // System.out.println(Arrays.toString(users));
//
//        for (int i = 0; i < users.length; i++) {
//            System.out.println(users[i]);
//        }


        String colors[]= { "Red","Blue","Black","Green" };
        colors[0]="White";
       // System.out.println(Arrays.toString(colors));


//        for (int i = 0; i < colors.length; i++) {
//            if(colors[i]=="Black"){
//                continue;
//            }
//            System.out.println(colors[i]);
//        }

//        int grades[]={100,50,20,30};
//
//        System.out.println(Arrays.toString(grades));


       ArrayList usersList = new ArrayList();
//        usersList.add("Saleh");
//        usersList.add(1);
//        usersList.add("Khalid");
//        usersList.add("Majed");
//        usersList.remove("Saleh");
//        usersList.set(0,"Ali");
//        System.out.println(usersList.get(0));
//
//        for (int i = 0; i < usersList.size(); i++) {
//            if(usersList.get(i).equals("Khalid")){
//                continue;
//            }
//            System.out.println(usersList.get(i));
//
//        }
//
//
//        int number1=5;
//        int number2=10;
//        System.out.println(number1+number2);
//
//        hello();
//        System.out.println("Hey from main");

        String name2="Saleh";
       // helloMessage("Saleh",23);

        int result=sum(30,40);
        int result2=result+sum(50,20);
        System.out.println(result2);

//        helloMessage("Ali",25);
//        helloMessage("Saleh",25);




        // Object user=usersList.get(0);


    }

    public static void hello(){
       if(5>2){
           return;
       }
            System.out.println("Hey from hello");
    }
    public static void helloMessage(String name , int age ){
        if(name.equals("Ali")){
            return;
        }
        System.out.println("Hey "+name+" from  helloMessage ");
        System.out.println("Your age is :  "+age);

    }
    public static int sum(int number1,int number2){
        int res=number1+number2;
        return res;
    }


}
