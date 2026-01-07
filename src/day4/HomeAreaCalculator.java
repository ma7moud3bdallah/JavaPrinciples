package day4;

public class HomeAreaCalculator {
    static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(10);
        int areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of room 1 is: "+areaOfRoom1);

        Rectangle room2 = new Rectangle();
        room2.setLength(10);
        room2.setWidth(5);
        int areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of room 2 is: "+areaOfRoom2);

        int totalArea = areaOfRoom1+areaOfRoom2;
        System.out.println("Total area is: "+totalArea);
    }
}
