package day5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static void main(String[] args) {
        int numbers[] = generateNumbers();
        printNumbers(numbers);
        int target = targetNumber();
        Arrays.sort(numbers);
        int index = binarySearch(numbers,target);
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
    static int binarySearch(int numbers[],int target){
        int left = 0;
        int right = numbers.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target==numbers[mid]){
                return mid;
            }
            else if(target<numbers[mid]){
                right = mid-1;
            }
            else if(target>numbers[mid]){
                left = mid+1;
            }
        }
        return -1;
    }
    static void printResult(int numbers[],int index){
        if(index>=0){
            System.out.println("Number found at index "+index);

        }
        else{
            System.out.println("Not found");
        }
    }
}
