package day4;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle Kitchen = calculator.getDimensions();
        Rectangle Bathroom = calculator.getDimensions();
        calculator.sc.close();
        int totalArea = calculator.calculateTotalArea(Kitchen,Bathroom);
        calculator.printTotalArea(totalArea);
    }
    Rectangle getDimensions(){
        System.out.println("Enter room length: ");
        int length = sc.nextInt();
        System.out.println("Enter room width: ");
        int width = sc.nextInt();
        Rectangle room = new Rectangle();
        room.setLength(length);
        room.setWidth(width);
        return room;
    }
    int calculateTotalArea(Rectangle Kitchen,Rectangle Bathroom){
        int totalArea = Kitchen.calculateArea()+Bathroom.calculateArea();
        return totalArea;
    }
    void printTotalArea(int totalArea){
        System.out.println("Total area is: "+totalArea);
    }
}
