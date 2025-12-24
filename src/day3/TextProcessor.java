package day3;

import java.util.Scanner;

public class TextProcessor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        boolean letterFound = false;
        int position = 0;
        for(int i=0;i<text.length();i++){
            char letter = text.charAt(i);
            if(letter=='A'||letter=='a'){
                letterFound = true;
                position = i+1;
                break;
            }
        }
        if(letterFound){
            System.out.println("Letter A found at position "+position);
        }
        else{
            System.out.println("Letter A not found");
        }
        sc.close();
    }
}
