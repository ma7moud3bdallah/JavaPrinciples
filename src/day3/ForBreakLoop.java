package day3;

import java.util.Scanner;

public class ForBreakLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        boolean letterFound = false;
        int position = 0;
        for(int i=0;i<name.length();i++){
            char letter = name.charAt(i);
            if(letter=='a'){
                letterFound = true;
                position = i+1;
                break;
            }
        }
        if(letterFound){
            System.out.println("Letter a found at position "+position);
        }
        else{
            System.out.println("Letter a not found");
        }
        sc.close();
    }
}
