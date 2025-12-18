package day2;

import java.util.Scanner;

public class LoopingStatements {
    static void main(String[] args) {
        int rate = 15;
        int maxHoursPerWeek = 40;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Working Hours: ");
        int workingHours = scanner.nextInt();

//        if(workingHours<maxworkingHours){
//            System.out.println("Your salary is: "+(workingHours*rate)+"$");
//        }
//        else{
//            System.out.println("plese enter valid working hours");
//            workingHours = scanner.nextInt();
//        }

        while (workingHours>maxHoursPerWeek) {
            System.out.println("Please enter number between 1 and 40");
            workingHours = scanner.nextInt();
        }
        System.out.println("Your salary is: "+(workingHours*rate)+"$");
        scanner.close();
    }
}

// you can't use if/else here because you need Loop keeps running while the specified condition remains true
// you can't use if/else here because you need Loop keeps running while the specified condition remains true