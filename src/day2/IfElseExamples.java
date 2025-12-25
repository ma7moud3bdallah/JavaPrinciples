package day2;

import java.util.Scanner;

public class IfElseExamples {
    static void main(String[] args) {
//        Example 1 : Largest of two numbers (if – else or ternary operator)
//        if – else
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = sc.nextInt();
//        if(num1>num2){
//            System.out.println("Num1 is largest");
//        }
//        else{
//            System.out.println("Num2 is largest");
//        }

//        ternary operator
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = sc.nextInt();
//        String largest = num1>num2 ? "Num1 is largest" : "Num2 is largest";
//        System.out.println(largest);
//        sc.close();


//        Example 2 : Smallest of 3 numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter num3: ");
//        int num3 = sc.nextInt();
//        if(num1<num2&&num1<num3){
//            System.out.println("Num1 is the smallest");
//        }
//        else if(num2<num1&&num2<num3){
//            System.out.println("Num2 is the smallest");
//        }
//        else{
//            System.out.println("Num3 is the smallest");
//        }


//        Example 3 : Day number based on day name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day name: ");
        String dayName = sc.nextLine().toLowerCase();
        switch(dayName){
            case"saturday":
                System.out.println(1);
                break;
            case"sunday":
                System.out.println(2);
                break;
            case"monday":
                System.out.println(3);
                break;
            case"tuesday":
                System.out.println(4);
                break;
            case"wednesday":
                System.out.println(5);
                break;
            case"thursday":
                System.out.println(6);
                break;
            case"friday":
                System.out.println(7);
                break;
            default:
                System.out.println("Invalid Day Number");
        }
        sc.close();
    }
}
