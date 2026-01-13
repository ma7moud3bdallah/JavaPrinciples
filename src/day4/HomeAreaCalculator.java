package day4;

import day7.Square;

public class HomeAreaCalculator {
    static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        System.out.println("The counter value is: "+Rectangle.getCounter());
//        room1.setLength(20);
//        room1.setWidth(10);
//        int areaOfRoom1 = room1.calculateArea();
//        System.out.println("Area of room 1 is: "+areaOfRoom1);

        Rectangle room2 = new Rectangle(10,5);
        System.out.println("The counter value is: "+Rectangle.getCounter());
//        int areaOfRoom2 = room2.calculateArea();
//        System.out.println("Area of room 2 is: "+areaOfRoom2);
//
//        int totalArea = areaOfRoom1+areaOfRoom2;
//        System.out.println("Total area is: "+totalArea);
    }
}
