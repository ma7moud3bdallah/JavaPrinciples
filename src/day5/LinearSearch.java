package day5;

import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        int numbers[] = generateNumbers();
        printNumbers(numbers);
        int target = targetNumber();
        int index = linearSearch(numbers,target);
        printResult(numbers,index);
    }
    static int[] generateNumbers(){
        int numbers[] = {1,3,5,7,9};
        return numbers;
    }
    static void printNumbers(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" | ");
        }
        System.out.println();
    }
    static int targetNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target number: ");
        int target = sc.nextInt();
        return target;
    }
    static int linearSearch(int numbers[],int target){
        for(int i=0;i<numbers.length;i++){
            if(target==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    static void printResult(int numbers[],int index){
        if(index!=-1){
            System.out.println("Number found at index "+index);
        }
        else {
            System.out.println("Not found");
        }
    }
}
