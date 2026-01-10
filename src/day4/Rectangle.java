package day4;

public class Rectangle {

    // Fields
    protected int length;
    protected int width;

    // Default Constructor
    public Rectangle(){
        System.out.println("Im default constructor");
        setLength(0);
        setWidth(0);
    }
    // Parameterized Constructor
    public Rectangle(int length,int width){
        System.out.println("Im parameterized constructor");
        setLength(length);
        setWidth(width);
    }

    // Setters
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    // Getters
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    // Methods
    public int calculateArea(){
        int area = length*width;
        return area;
    }
    public int calculatePerimeter(){
        int perimeter = length*2+width*2;
        return perimeter;
    }
}
