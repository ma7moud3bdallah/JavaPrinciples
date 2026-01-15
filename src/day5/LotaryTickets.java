package day5;

import java.util.Random;

public class LotaryTickets {
    private static final int LENGTH = 6;
    private static final int MIN = 1;
    private static final int MAX = 69;

    static void main(String[] args) {
        int numbers[] = GenerateNumbers();
        printNumbers(numbers);
    }
    static int[] GenerateNumbers(){
        int numbers[] = new int[LENGTH];
        for(int i=0;i<numbers.length;i++){
            Random random = new Random();
            numbers[i] = random.nextInt(MIN,MAX);
        }
        return numbers;
    }
    static void printNumbers(int numbers[]){
        // Enhanced for loop
        for(int number:numbers){
            System.out.print(number+" | ");
        }
    }
}
