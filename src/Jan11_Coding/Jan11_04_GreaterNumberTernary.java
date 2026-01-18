package Jan11_Coding;
import java.util.Scanner;
//Write a Java program to find the maximum of two numbers using the ternary operator.
public class Jan11_04_GreaterNumberTernary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double firstInput = 0;
        double secondInput = 0;

        System.out.println("Enter the first input");
        if (input.hasNextDouble()) {
            firstInput = input.nextDouble();
        } else {
            System.out.println("Enter the input with valid datatype");
            return;
        }
        System.out.println("Enter the second input");
        if (input.hasNextDouble()) {
            secondInput = input.nextDouble();
        } else {
            System.out.println("Enter the input with valid datatype");
            return;
        }
        String result = firstInput != secondInput ? (firstInput > secondInput ? firstInput + "is greater number" : secondInput + "is greater number") : "Both the number are equal";

        System.out.println(result);

        input.close();
    }
}

