package day3;

import java.util.Scanner;

public class ForNestedLoop {
    static void main(String[] args) {
        int studentNum = 3;
        int courseNum = 4;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<studentNum;i++){
            int total = 0;
            for(int j=0;j<courseNum;j++){
                System.out.println("Enter score of course "+(j+1)+" for student "+(i+1));
                int score = sc.nextInt();
                total +=score;
            }
            int avg = total/courseNum;
            System.out.println("Average of score for student "+(i+1)+" is "+avg);
        }
        sc.close();
    }
}