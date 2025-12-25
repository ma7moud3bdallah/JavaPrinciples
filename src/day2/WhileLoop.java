package day2;

import java.util.Scanner;

public class WhileLoop {
    static void main(String[] args) {
        int rate = 15;
        int maxHoursPerWeek = 40;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Working Hours: ");
        int workingHours = scanner.nextInt();
        while (workingHours>maxHoursPerWeek) {
            System.out.println("Please enter number between 1 and 40");
            workingHours = scanner.nextInt();
        }
        System.out.println("Your salary is: "+(workingHours*rate)+"$");
        scanner.close();
    }
}
