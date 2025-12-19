package day2;

import java.util.Scanner;

public class IfAssignment {
    static void main(String[] args) {
        // Example 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = sc.nextInt();
//        if(num1>num2){
//            System.out.println("The first number is the largest");
//        }
//        else{
//            System.out.println("The second number is the largest");
//        }
//        String result = num1>num2 ? "The first number is the largest" : "The second number is the largest";
//        System.out.println(result);
//        sc.close();

        // Example 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the third number: ");
//        int num3 = sc.nextInt();
//        if(num1<num2&&num1<num3){
//            System.out.println("The first number is the smallest");
//        }
//        else if(num2<num1&&num2<num3){
//            System.out.println("The second number is the smallest");
//        }
//        else{
//            System.out.println("The third number is the smallest");
//        }
//        sc.close();

        // Example 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day name: ");
        String dayName = sc.nextLine().toLowerCase();
        switch(dayName){
            case"sunday":
                System.out.println("1");
                break;
            case"monday":
                System.out.println("2");
                break;
            case"tuesday":
                System.out.println("3");
                break;
            case"wednesday":
                System.out.println("4");
                break;
            case"thursday":
                System.out.println("5");
                break;
            case"friday":
                System.out.println("6");
                break;
            case"saturday":
                System.out.println("7");
                break;
            default:
                System.out.println("Invalid day name");
        sc.close();
        }
    }
}
