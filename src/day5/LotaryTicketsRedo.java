package day5;

import java.util.Arrays;
import java.util.Random;

public class LotaryTicketsRedo {
    private static final int LENGTH = 6;
    private static final int MIN = 1;
    private static final int MAX = 69;

    static void main(String[] args) {
        int numbers[] = GenerateNumbers();
        Arrays.sort(numbers);
        printNumbers(numbers);
        binarySearch(numbers,10);
    }
    static int[] GenerateNumbers(){
        int numbers[] = new int[LENGTH];
        for(int i=0;i<numbers.length;i++){
            Random random = new Random();
            int randomNumber;
            do{
                randomNumber = random.nextInt(MIN,MAX);
            }
            while(linearSearch(numbers,randomNumber));
            numbers[i] = randomNumber;
        }
        return numbers;
    }
    static void printNumbers(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" | ");
        }
        System.out.println();
    }
    /**
     * This method search throw an array in a linear way
     * @param numbers array to search throw
     * @param randomNumber number to search for
     * @return true if found and false if not found
     */
    static boolean linearSearch(int[] numbers,int randomNumber){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==randomNumber){
                return true;
            }
        }
        return false;
    }
    /**
     * This method search throw an array in a Binary way
     * @param numbers
     * @param number
     */
    static void binarySearch(int numbers[],int number){
        int index = Arrays.binarySearch(numbers,number);
        if(index<0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
        }
    }
}

