package CodingTests;

import java.util.Scanner;
//Write a Java program to print the month name based on the month number (1–12) using a switch statement.
public class Jan11_08_MonthNumberSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month number.");
        if (input.hasNextInt()){
            int monthOfYear = input.nextInt();
            switch(monthOfYear){
                case 1 -> System.out.println("January");
                case 2 -> System.out.println("February");
                case 3 -> System.out.println("March");
                case 4 -> System.out.println("April");
                case 5 -> System.out.println("May");
                case 6 -> System.out.println("June");
                case 7 -> System.out.println("July");
                case 8 -> System.out.println("August");
                case 9 -> System.out.println("September");
                case 10 -> System.out.println("October");
                case 11 -> System.out.println("November");
                case 12 -> System.out.println("December");
                default ->System.out.println("Enter the valid month number between 1 - 12");
            }
        }else{
            System.out.println("Enter the valid month number between 1 - 12");
        }
    }
}
