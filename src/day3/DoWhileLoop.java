package day3;

import java.util.Scanner;

public class DoWhileLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter num1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter num2: ");
            int num2 = sc.nextInt();
            System.out.println("The sum is: "+(num1+num2));
            System.out.println("Another trial? ");
            again = sc.nextBoolean();
        }
        while(again);
        sc.close();
    }
}