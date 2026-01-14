package CodingTests;

import java.util.Scanner;

public class Jan11_01_ArithmeticOpsOn2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the Second number");
        double num2 = scanner.nextDouble();

        //Addition:
        double add = num1 + num2;
        System.out.println("Addition = " + add);

        //Subtraction:
        double sub = num1 - num2;
        System.out.println("Subtraction = " + sub);

        //Multiplication:
        double mul = num1 * num2;
        System.out.println("Multiplication = " + mul);

        //Division:
        double div = num1 / num2;
        System.out.println("Division = " + div);

        //Reminder:
        double rem = num1 % num2;
        System.out.println("Reminder = " + rem);

        scanner.close();
    }
}
