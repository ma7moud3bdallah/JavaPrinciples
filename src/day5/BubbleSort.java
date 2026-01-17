package day5;

public class BubbleSort {
    static void main(String[] args) {
        int numbers[] = generateNumbers();
        printNumbersBefore(numbers);
        bubbleSort(numbers);
        printNumbersAfter(numbers);
    }
    static int[] generateNumbers(){
        int numbers[] = {3,9,1,7,5};
        return numbers;
    }
    static void printNumbersBefore(int numbers[]){
        System.out.print("Array before sorting: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" | ");
        }
        System.out.println();
    }
    static void bubbleSort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
    }
    static void printNumbersAfter(int numbers[]){
        System.out.print("Array after sorting: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" | ");
        }
    }
}
