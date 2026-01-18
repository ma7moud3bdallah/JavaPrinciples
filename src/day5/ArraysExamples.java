package day5;

import java.util.Scanner;

public class ArraysExamples {
    static void main(String[] args) {
        // Ex2 : find number of repetition of a certain number
//        int numbers[] = {1,2,3,2,5,6,2,8,9};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter target number: ");
//        int target = sc.nextInt();
//        int counter = 0;
//        for(int i=0;i<numbers.length;i++){
//            if(target==numbers[i]){
//                counter++;
//            }
//        }
//        System.out.println("Target number found "+counter+" times");

        // Ex4: print an array in reverse order
//        int numbers[] = {1,3,5,7,9};
//        for(int i=numbers.length-1;i>=0;i--){
//            System.out.print(numbers[i]+" | ");
//        }

        // Ex5: Check if the array has prime numbers or not
        int numbers[] = {4,6,7,8,9,11};
        boolean flag = false;
        int counter = 0;
        for(int number:numbers){
            if(primeNumber(number)){
                flag = true;
                counter++;
            }
        }
        if(flag){
            System.out.println("Prime number found "+counter+" times");
        }
        else{
            System.out.println("Prime number not found ");
        }

        // Ex6: Print count of  Even and Odd numbers from an array
//        int numbers[] = {1,2,3,4,5,6};
//        int oddCounter = 0;
//        int evenCounter = 0;
//        for(int number:numbers){
//            if(number%2==0){
//                evenCounter++;
//            }
//            else{
//                oddCounter++;
//            }
//        }
//        System.out.println("Even numbers are "+evenCounter);
//        System.out.println("Odd numbers are "+oddCounter);
    }
    static boolean primeNumber(int number) {
        for (int i=2;i<number;i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
}
