package day4;

public class Rectangle {
    // Fields
    private int length;
    private int width;

    // Setters
    void setLength(int length){
        this.length = length;
    }
    void setWidth(int width){
        this.width = width;
    }
    // Getters
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }

    // Methods
    int calculateArea(){
        int area = length*width;
        return area;
    }
    int calculatePerimeter(){
        int perimeter = length*2+width*2;
        return perimeter;
    }
}
