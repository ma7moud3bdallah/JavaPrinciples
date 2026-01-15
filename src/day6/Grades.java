package day6;

import java.util.Scanner;

public class Grades {
    static void main(String[] args) {
        int grades[] = getGrades();
        printGrades(grades);
        calculateAverage(grades);
    }
    static int[] getGrades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many grades? ");
        int length = sc.nextInt();
        int grades[] = new int[length];
        for(int i=0;i<grades.length;i++){
            System.out.println("Enter grade: "+(i+1));
            grades[i] = sc.nextInt();
        }
        return grades;
    }
    static void printGrades(int grades[]){
        for(int grade:grades){
            System.out.println(grade);
        }
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
}
