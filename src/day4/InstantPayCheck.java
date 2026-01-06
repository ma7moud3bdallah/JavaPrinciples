package day4;

import java.util.Scanner;

public class InstantPayCheck {
    static int requiredSalary = 20000;
    static int requiredCreditScore = 700;
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        int salary = getEmployeeSalary();
        int CreditScore = getEmployeeCreditScore();
        boolean qualified = isQualified(salary,CreditScore);
        sc.close();
        notifyUser(qualified);
    }

    static int getEmployeeSalary(){
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();
        return salary;
    }
    static int getEmployeeCreditScore(){
        System.out.println("Enter your Credit Score: ");
        int CreditScore = sc.nextInt();
        return CreditScore;
    }
    static boolean isQualified(int salary,int CreditScore){
        if(salary>requiredSalary&&CreditScore>requiredCreditScore){
            return true;
        }
        else{
            return false;
        }
    }
    static void notifyUser(boolean qualified){
        if(qualified){
            System.out.println("Congratulations, you are qualified for the loan");
        }
        else{
            System.out.println("Sorry, you are not qualified for the loan");
        }
    }
}
