package day5;

import java.util.Scanner;

public class MonthConverter {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter month name: ");
//        String inputMonth = sc.nextLine();
//        Month month = new Month();
//        int num = month.getMonth(inputMonth);
//        System.out.println(num);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter month number: ");
//        int inputMonth = sc.nextInt();
//        Month month = new Month();
//        String name = month.getMonth(inputMonth);
//        System.out.println(name);

        System.out.println(Month.getMonth(1));
        System.out.println(Month.getMonth("Jan"));
    }
}
