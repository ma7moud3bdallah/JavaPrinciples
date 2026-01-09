package day5;

import java.util.Scanner;

public class MonthConverter {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter month name: ");
//        String monthName = sc.nextLine();
//        Month month = new Month();
//        int num = month.getMonth(monthName);
//        System.out.println(num);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter month number: ");
//        int monthNum = sc.nextInt();
//        Month month = new Month();
//        String name = month.getMonth(monthNum);
//        System.out.println(name);

        System.out.println(Month.getMonth("Jan"));
        System.out.println(Month.getMonth(1));
    }
}
