package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int number = numbers[i];
            int secondNumber = target - number;
            map.put(number,i);
            if(map.containsKey(secondNumber)){
                System.out.println(map.get(secondNumber)+","+map.get(number));
            }
        }
    }
}
