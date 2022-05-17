package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Functional {

    private static ArrayList <String> users= new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        readUserName(in);
    }

    public static void readUserName(Scanner in){
        System.out.println("Enter your username :");
        String username = in.next();
        readPassword(in,username);
    }

    public static void readPassword(Scanner in,String username){
        System.out.println("Enter your password :");
        String password = in.next();
        checkInput(username,password);
    }
    public static void checkInput(String username,String password) throws  RuntimeException{
        if(username.length()<3|| password.length() < 3){
           throw  new RuntimeException("Invalid input");
        }
        saveUser(username);

    }
    public static  void saveUser(String username){
        users.add(username);
    }

}
