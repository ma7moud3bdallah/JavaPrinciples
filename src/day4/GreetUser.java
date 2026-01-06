package day4;

import java.util.Scanner;

public class GreetUser {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
        sc.close();
    }

    static String getUserName(){
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        return name;
    }
    static void greetUser(String name){
        System.out.println("Hello "+name);
    }
}
