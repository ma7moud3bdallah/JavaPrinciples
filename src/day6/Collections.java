package day6;

import java.util.*;

public class Collections {
    static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
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
    static void listDemo(){
        /**
         * List
         * ArrayList - LinkedList - Stack - Vector
         */
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        fruit.remove(0);
        System.out.println(fruit.size());
        System.out.println(fruit);
    }
    static void queueDemo(){
        /**
         * Queue
         * LinkedList - PriorityQueue
         */
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        fruit.remove();
        fruit.remove();
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.element());
    }
    static void mapDemo(){
        /**
         * Map
         * HashMap - LinkedHashmap - TreeMap
         */
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple",100);
        fruitCalories.put("lemon",80);
        fruitCalories.put("banana",100);
        fruitCalories.put("orange",200);
        fruitCalories.putIfAbsent("lemon",16);
        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);
    }
}
