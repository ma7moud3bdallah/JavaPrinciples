package Assignments;

import java.util.Scanner;

public class Assignment2 {
    static void main(String[] args) {
//        1. Write a program that uses a loop to reverse an integer number.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int reversedNumber = 0;
//        while(num!=0){
//            int digit=num%10;
//            reversedNumber = reversedNumber*10 + digit;
//            num = num/10;
//        }
//        System.out.println("Reversed number is: "+reversedNumber);
//        sc.close();

//        2. Count how many digits are in a given number using loops.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int count = 0;
//        while(num!=0){
//            count++;
//            num=num/10;
//        }
//        System.out.println("Number has "+count+" digits");
//        sc.close();

//        3. Write a program that calculates the sum of digits of a number.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int sum = 0;
//        while(num!=0){
//            int digit = num%10;
//            sum += digit;
//            num = num/10;
//        }
//        System.out.println("The sum of digits number is "+sum);
//        sc.close();

//        4. Print all prime numbers between 1 and 100 using loops.
//        for (int i=2;i<=100;i++){
//            boolean prime = true;
//            for (int j=2;j<=i-1;j++){
//                if (i%j==0) {
//                    prime = false;
//                    break;
//                }
//            }
//            if(prime){
//                System.out.print(i);
//                System.out.print("\n");
//            }
//        }

//        5. Write a program that keeps asking the user to enter a password until the correct password is
//        entered.
//        int correctPawword = 1234;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter password: ");
//        int password = sc.nextInt();
//        while(password!=correctPawword){
//            System.out.println("Please enter correct password: ");
//            password = sc.nextInt();
//        }
//        System.out.println("Password is correct");
//        sc.close();

//        6. Write a program that keeps asking the user to enter a number until the number is divisible by 5.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        while(num%5!=0){
//            System.out.println("Number is not divisible by 5, Please enter number again: ");
//            num = sc.nextInt();
//        }
//        System.out.println("Number "+num+" is divisible by 5 and result is: "+(num/5));
//        sc.close();

//        7. Create a menu-driven program that repeats until the user chooses Exit.
//        Scanner sc = new Scanner(System.in);
//        int select;
//        int num1;
//        int num2;
//        do{
//            System.out.println("1. Add two numbers\n" +
//                               "2. Subtract two numbers\n" +
//                               "3. Multiply two numbers\n" +
//                               "4. Exit");
//            System.out.println("Select from 1-4: ");
//            select = sc.nextInt();
//            switch(select){
//                case 1:
//                    System.out.println("Enter num1");
//                    num1 = sc.nextInt();
//                    System.out.println("Enter num2");
//                    num2 = sc.nextInt();
//                    System.out.println("Sum is: "+(num1+num2));
//                    break;
//
//                case 2:
//                    System.out.println("Enter num1");
//                    num1 = sc.nextInt();
//                    System.out.println("Enter num2");
//                    num2 = sc.nextInt();
//                    System.out.println("Subtract is: "+(num1-num2));
//                    break;
//                case 3:
//                    System.out.println("Enter num1");
//                    num1 = sc.nextInt();
//                    System.out.println("Enter num3");
//                    num2 = sc.nextInt();
//                    System.out.println("Multiply is: "+(num1*num2));
//                    break;
//                case 4:
//                    System.out.println("Good Bye!");
//                    break;
//                default:
//                    System.out.println("Invalid selection");
//            }
//        }
//        while(select!=4);
//        sc.close();

//        8. Write a program that calculates the factorial of a number entered by the user.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int factorial = 1;
//        for(int i=1;i<=num;i++){
//            factorial *= i;
//        }
//        System.out.println("Factorial is: "+factorial);
//        sc.close();

//        9. Keep reading numbers from the user and stop when the user enters 0, then print the sum of all
//        entered numbers.
//        Scanner sc = new Scanner(System.in);
//        int num;
//        int sum = 0;
//        do{
//            System.out.println("Enter number: ");
//            num = sc.nextInt();
//            sum += num;
//        }
//        while(num!=0);
//        System.out.println("Sum of numbers is: "+sum);
//        sc.close();

//        10. Write a program to print the Fibonacci series up to n terms using loops.
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of terms");
//        int n = sc.nextInt();
//        int first = 0;
//        int next = 1;
//        for(int i=0;i<n;i++){
//            System.out.println(first+" ");
//            int sum = first + next;
//            first = next;
//            next = sum;
//        }
//        sc.close();

//        11. Write a program to check whether a number is a palindrome or not using loops.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc. nextInt();
//        int originalNum = num;
//        int reversedNum = 0;
//        while(num!=0){
//            int digit = num%10;
//            reversedNum = reversedNum*10 + digit;
//            num = num/10;
//        }
//        if(reversedNum==originalNum){
//            System.out.println("number is a palindrome");
//        }
//        else{
//            System.out.println("number is not a palindrome");
//        }
//        sc.close();
    }
}
