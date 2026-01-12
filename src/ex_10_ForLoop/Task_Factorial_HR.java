package ex_10_ForLoop;

import java.util.Scanner;

public class Task_Factorial_HR {
    public static void main(String[] args) {

        System.out.println("Welcome to Java Factorial Program");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the positive number");

        int fact = 1;

        if (scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println("User input is: "+ num);
            for(int i = 1; i <=num; i++){
                fact = fact * i;
            }
            System.out.println(fact);

            scanner.close();
        }else{
            System.out.println("Please enter the input");
        }

    }
}
