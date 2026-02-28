package problemSolving;

public class MaxNumber {
    static void main(String[] args) {
        int[] numbers = {2,9,4,6,1,7};
        int maxCount = 0;
        for(int number:numbers){
            if(number>maxCount){
                maxCount = number;
            }
        }
        System.out.println("Max number is: "+maxCount);
    }
}
