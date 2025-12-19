package day2;

import java.util.Scanner;

public class ConditionalStatements {
    static void main(String[] args) {
        // Example 1
//        int age = 18;
//        if(age >=18){
//            System.out.println("Eligible for vote");
//        }
//        else{
//            System.out.println("Not eligible for vote");
//        }

        // Example 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Number: ");
//        int number = scanner.nextInt();
//        if(number%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
//        scanner.close();

        // Example 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Number: ");
//        int number = scanner.nextInt();
//        if(number>0){
//            System.out.println("Positive");
//        }
//        else if(number<0){
//            System.out.println("Negative");
//        }
//        else{
//            System.out.println("Zero");
//        }
//        scanner.close();

        //Example 4
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First Number: ");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter Second Number: ");
//        int num2 = scanner.nextInt();
//        System.out.println("Enter Third Number: ");
//        int num3 = scanner.nextInt();
//        if(num1>num2 && num1>num3){
//            System.out.println("First Number is the Largest");
//        }
//        else if(num2>num1 && num2>num3){
//            System.out.println("Second Number is the Largest");
//        }
//        else{
//            System.out.println("Third Number is the Largest");
//        }
//        scanner.close();

        // Example 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Day Number: ");
        int dayNumber = scanner.nextInt();
//        if(dayNumber==1){
//            System.out.println("Sunday");
//        }
//        else if(dayNumber==2){
//            System.out.println("Monday");
//        }
//        else if(dayNumber==3){
//            System.out.println("Tuesday");
//        }
//        else if(dayNumber==4){
//            System.out.println("Wednesday");
//        }
//        else if(dayNumber==5){
//            System.out.println("Thursday");
//        }
//        else if(dayNumber==6){
//            System.out.println("Friday");
//        }
//        else if(dayNumber==7){
//            System.out.println("Saturday");
//        }
//        else{
//            System.out.println("Invalid Day Number");
//        }
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day Number");
        }
        scanner.close();
    }
}

