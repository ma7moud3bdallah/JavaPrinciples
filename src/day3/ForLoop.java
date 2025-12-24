package day3;

import java.util.Scanner;

public class ForLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int num = sc.nextInt();
        int total = 0;
        for(int i=0;i<num;i++){
            System.out.println("Enter cost of item: "+(i+1));
            int cost = sc.nextInt();
            total += cost;
        }
        System.out.println("Total cost is: "+total);
        sc.close();
    }
}
