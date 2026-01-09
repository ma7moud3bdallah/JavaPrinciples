package day7;

import day4.Rectangle;

public class Square extends Rectangle {
    @Override
    public int calculatePerimeter(){
        int perimeter = length*4;
        return perimeter;
    }
}
