package CodingTests;

import java.util.Scanner;

public class Jan11_05_PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first input");
        if (input.hasNextDouble()){
            double userInput = input.nextDouble();
            String result = userInput != 0 ? (userInput > 0 ? userInput + " is a positive number" : userInput + " is a negative number") : "Its a zero";

            System.out.println(result);
        }else{
            System.out.println("Enter the input with valid datatype");
        }
        input.close();
    }
}
