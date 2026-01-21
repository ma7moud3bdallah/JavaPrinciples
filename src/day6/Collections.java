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
        Set<String> fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        fruits.remove("lemon");
        System.out.println(fruits.size());
        System.out.println(fruits);

        // (1) Looping through collection using iterator
        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // (2) Looping through collection using enhanced for loop
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        // (3) Looping through collection using forEach
        fruits.forEach(x -> System.out.println(x));
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
        fruit.remove(0);
        fruit.add("apple");
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
        Map<String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple",100);
        fruitCalories.put("lemon",80);
        fruitCalories.put("banana",100);
        fruitCalories.put("orange",200);
        fruitCalories.putIfAbsent("lemon",16);
        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        // (1) Looping through Map using enhanced for loop
//        for(var fruit:fruitCalories.entrySet()){
//            System.out.println(fruit.getKey()+","+fruit.getValue());
//        }

        // (2) Looping through Map using forEach
        fruitCalories.forEach((x,y) -> System.out.println(x+","+y));
    }
}
