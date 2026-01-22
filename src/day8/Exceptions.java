package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    static void main(String[] args) {
//        createFile();
        numbersExceptionHandling();
    }
    static void createFile(){
        File file = new File("resources/nonexist.txt");
        try{
            file.createNewFile();
        }
        catch(IOException e){
            System.out.println("Path doesn't exist");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello from after exception");
    }
    static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                double num = sc.nextDouble();
                System.out.println(num);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.out.println("Mismatching data");
            e.printStackTrace();
        }
        System.out.println("Hello from after exception");
    }
}
