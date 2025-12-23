package day3;

import java.util.Scanner;

public class AddingTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter First Number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = sc.nextDouble();
            System.out.println("The sum of two numbers is "+(num1+num2));
            System.out.println("Do you want to repeat?");
            again = sc.nextBoolean();
        }
        while(again);
        sc.close();
    }
}
