package day8;

public class Rectanglee extends Shape{
    // Fields
    private int length;
    private int width;

    // Parameterized constructor
    public Rectanglee(int length, int width){
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

    @Override
    public int calculateArea(){
        return length*width;
    }
}
