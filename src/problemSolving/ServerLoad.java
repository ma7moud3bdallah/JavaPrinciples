package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class ServerLoad {
    static void main(String[] args) {
        int[] numbers = {1, 2, 10, 3, 2};
        double sum = 0;
        for(int number:numbers){
            sum += number;
        }
        double average = sum/numbers.length;
        double threshold = average*2;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>threshold){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
