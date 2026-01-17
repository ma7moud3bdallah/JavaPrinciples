package day6;

import java.util.Scanner;

public class Grades {
    private static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        int grades[] = getGrades();
        System.out.println("Average score is: "+calculateAverage(grades));
        System.out.println("Highest score is: "+getHighest(grades));
        System.out.println("Lowest score is: "+getLowest(grades));
        sc.close();
    }
    static int[] getGrades(){
        System.out.println("How many grades? ");
        int length = sc.nextInt();
        int grades[] = new int[length];
        for(int i=0;i<grades.length;i++){
            System.out.println("Enter grade: "+(i+1));
            grades[i] = sc.nextInt();
        }
        return grades;
    }
    static int sum(int grades[]){
        int sum = 0;
        for(int grade:grades){
            sum += grade;
        }
        return sum;
    }
    static int calculateAverage(int grades[]){
        int avg = sum(grades)/grades.length;
        return avg;
    }
    static int getHighest(int grades[]){
        int highest = grades[0];
        for(int grade:grades){
            if(grade>highest){
                highest = grade;
            }
        }
        return highest;
    }
    static int getLowest(int grades[]){
        int lowest = grades[0];
        for(int grade:grades){
            if(grade<lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
