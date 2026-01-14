package CodingTests;

import java.util.Scanner;

//Description:
//Write a Java program to convert a double value into an int using explicit type casting and print both values.

public class Jan11_03_ExplicitCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        double number = input.nextDouble();

        System.out.println("User double datatype input is :"+ number);

        int integerValue =(int) number;
        System.out.println("The integer typecast output is: "+integerValue);

        input.close();


    }
}
