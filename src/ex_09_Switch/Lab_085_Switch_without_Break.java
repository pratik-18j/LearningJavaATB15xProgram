package ex_09_Switch;

import java.util.Scanner;

public class Lab_085_Switch_without_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 for the day");
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");

                case 3:
                    System.out.println("Wednesday");

                case 4:
                    System.out.println("Thursday");

                case 5:
                    System.out.println("Friday");

                case 6:
                    System.out.println("Saturday");

                case 7:
                    System.out.println("Sunday");

                default:
                    System.out.println("Enter the valid number between 1 to 7");
            }
            System.out.println("End of program!!!");
        } else {
            System.out.println("Invalid input");
        }
    }
}
