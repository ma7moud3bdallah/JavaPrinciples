package day4;

import java.util.Scanner;

public class GreetUser {
    static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }
    static String getUserName(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    return name;
    }
    static void greetUser(String name){
    System.out.println("Hello "+name);
    }
}
