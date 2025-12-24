package day3;

import java.util.Scanner;

public class Cashier {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int num = sc.nextInt();
        double total = 0;
        for(int i=0; i<num; i++){
            System.out.println("Enter the cost of item "+(i+1));
            double price = sc.nextDouble();
            total +=price;
        }
        System.out.println("The total price is "+total);
        sc.close();
    }
}



