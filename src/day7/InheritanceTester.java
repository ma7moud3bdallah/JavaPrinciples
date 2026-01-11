package day7;

import day4.Rectangle;

public class InheritanceTester {
    static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(20);
//        rectangle.setWidth(10);
//        int rectanglePerimeter = rectangle.calculatePerimeter();
//        System.out.println(rectanglePerimeter);
//        Square square = new Square();
//        square.setLength(10);
//        int squarePerimeter = square.calculatePerimeter();
//        System.out.println(squarePerimeter);

        Mother mother = new Mother();
        System.out.println(mother.getName());
    }
}
