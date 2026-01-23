package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    static void main(String[] args) throws Exception{
//        createFile();
        createFileRethrow();
//        numbersExceptionHandling();
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
    static void createFileRethrow() throws IOException{
        File file = new File("resourcees/nonexist.txt");
        file.createNewFile();
    }
    static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
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
        finally{
            sc.close();
        }
        System.out.println("Hello from after exception");
    }
}
