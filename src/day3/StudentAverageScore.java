package day3;

import java.util.Scanner;

public class StudentAverageScore {
    static void main(String[] args) {
        int numberOfStudents = 3;
        int numberOfCourses = 4;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numberOfStudents;i++){
            int total = 0;
            for(int j=0;j<numberOfCourses;j++){
                System.out.println("Enter score of course "+(j+1)+" for student "+(i+1));
                int score = sc.nextInt();
                total += score;
            }
            int avg = total/numberOfCourses;
            System.out.println("The average score of student "+(i+1)+" is "+avg);
        }
        sc.close();
    }
}
