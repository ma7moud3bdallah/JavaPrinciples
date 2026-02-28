package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    static void main(String[] args) {
        String text = "aabbcdde";
        char[] arrOfChar = text.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char character:arrOfChar){
            if(map.containsKey(character)){
                map.put(character,map.get(character)+1);
            }
            else{
                map.put(character,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non repeated character is: "+entry.getKey());
                break;
            }
        }
    }
}
