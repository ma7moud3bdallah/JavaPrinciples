package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class PhoneWordsToDigits {
    static void main(String[] args) {
        String input = "one two three four";
        String[] words = input.split(" ");
        Map<String,String> map  = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        StringBuilder result = new StringBuilder();
        for(String word:words){
            if(map.containsKey(word)){
                result.append(map.get(word));
            }
            else{
                result.append("?");
            }
        }
        System.out.println(result);
    }
}
