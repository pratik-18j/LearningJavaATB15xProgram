package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_084_If_Else_If_Else {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age>32){
            System.out.println("My age is greater than 34");
        }
        else if (age<34){
            System.out.println("My age is less than 34");
        }
        else {
            System.out.println("My age is 34");
        }
    }

}
