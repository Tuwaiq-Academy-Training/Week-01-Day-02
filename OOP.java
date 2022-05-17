package com.company;

import java.util.Scanner;

public class OOP {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter your username : ");
        String username= in.next();

        System.out.println("Please enter your password : ");
        String password= in.next();

        if(!checkInput(username,password)){
            throw  new RuntimeException("Your input must be more than 3 in length");
        }

        User user=new User(username,password);


    }

    public static  boolean checkInput(String username,String password){
        if(username.length()<3 || password.length() <3){
            return false;
        }
        return true;
    }
}
