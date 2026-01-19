package day6;

import java.util.HashSet;
import java.util.Set;

public class Collections {
    static void main(String[] args) {
        setDemo();
    }
    static void setDemo(){
        /**
         * Set
         * HashSet - LinkedHashSet - TreeSet
         */
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("apple");
        System.out.println(fruit.size());
        System.out.println(fruit);
    }
}
