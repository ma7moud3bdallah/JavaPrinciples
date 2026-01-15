package day5;

import java.util.Random;

public class LotaryTicketsRedo {
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
            int randomNumber;
            do{
                randomNumber = random.nextInt(MIN,MAX);
            }
            while(Search(numbers,randomNumber));
            numbers[i] = randomNumber;
        }
        return numbers;
    }
    static void printNumbers(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
    static boolean Search(int[] numbers,int randomNumber){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==randomNumber){
                return true;
            }
        }
        return false;
    }
}
