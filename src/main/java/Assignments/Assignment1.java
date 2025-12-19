package Assignments;

import java.util.Scanner;

public class Assignment1 {
    static void main(String[] args) {
        // Arithmetic operations
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Num1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter Num2: ");
//        int num2 = sc.nextInt();
//        System.out.println("The sum of the two numbers is: "+(num1+num2));
//        System.out.println("The difference between the two numbers is: "+(num1-num2));
//        System.out.println("The product of the two numbers is: "+(num1*num2));
//        System.out.println("The remainder of the two numbers is: "+(num1%num2));
//        sc.close();

        // If conditions
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Num1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter Num2: ");
//        int num2 = sc.nextInt();
//        if(num1>num2){
//            System.out.println("num1 is greater than num2");
//        }
//        else if(num2>num1){
//            System.out.println("num2 is greater than num1");
//        }
//        else{
//            System.out.println("Two numbers are equal");
//        }
//        sc.close();

        // Logical operators
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Num1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter Num2: ");
//        int num2 = sc.nextInt();
//        if(num1>0&&num2>0){
//            System.out.println("Both are positive");
//        }
//        else if(num1>0||num2>0){
//            System.out.println("One is positive");
//        }
//        else{
//            System.out.println("No positives");
//        }

        // Ternary operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = sc.nextInt();
        String result1 = num1>num2 ? "Num1 is greater" : "Num2 is greater";
        System.out.println(result1);
        String result2 = num1%2==0 ? "Num1 is even" : "Num1 is odd";
        System.out.println(result2);
        sc.close();
    }
}
