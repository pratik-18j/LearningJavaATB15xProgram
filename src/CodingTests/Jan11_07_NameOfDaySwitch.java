package CodingTests;

import java.util.Scanner;
//Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.
public class Jan11_07_NameOfDaySwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber = input.nextDouble();
        System.out.println("Enter the second number");
        double secondNumber = input.nextDouble();

        System.out.println("Please enter the operation like addition, subtraction, multiplication, division");
        String operation = input.next().toLowerCase();

        switch(operation){
            case "addition"-> System.out.println("Addition = "+ (firstNumber + secondNumber));
            case "subtraction" -> System.out.println("Subtraction = "+ (firstNumber - secondNumber));
            case "multiplication" -> System.out.println("Multiplication = "+ (firstNumber * secondNumber));
            case "division" -> {
                if (secondNumber != 0){
                    System.out.println("Division = "+ (firstNumber / secondNumber));
                }else{
                    System.out.println("Warning! Can not divide any number by zero.");
                }
            }
            default -> System.out.println("Enter the valid operation");

        }
        input.close();
    }
}
