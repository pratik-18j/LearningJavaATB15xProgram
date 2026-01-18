package Jan18_Coding;
//Write a Java program to convert a given string into uppercase and print the result.

import java.util.Scanner;

public class Jan18_03_String_Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string!");
        String user_Input = scanner.next();

        System.out.println(user_Input.toUpperCase());
    }
}
