package com.company;

public class User {

    String username;
    String password;


    public  User(String username , String password){
     this.username=username;
     this.password=password;
    }

    public void login(){
        System.out.println("Welcome back");
    }

    public void logout(){
        System.out.println("Goodbye");
    }
}
