package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {
    static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int number:numbers){
            if(map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }
            else{
                map.put(number,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Duplicate numbers are: "+entry.getKey()+" and duplicated "+entry.getValue()+" times");
            }
        }
    }
}
