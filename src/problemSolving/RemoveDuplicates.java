package problemSolving;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {
    static void main(String[] args) {
        String text = "programming";
        char[] characters = text.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char character:characters){
            if(map.containsKey(character)){
                map.put(character,map.get(character)+1);
            }
            else{
                map.put(character,1);
            }
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            result.append(entry.getKey());
        }
        System.out.println(result);
    }
}
