package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    static void main(String[] args) {
        String text = "java is easy java is powerful java is fast fast fast";
        String[] words = text.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        String maxWord = "";
        int maxCount = 0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most frequent word is "+maxWord+":"+maxCount);
    }
}
