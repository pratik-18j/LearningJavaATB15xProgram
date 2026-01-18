package Jan18_Coding;
//Write a Java program to compare two strings and check whether they are equal or not.

import java.util.Scanner;

public class Jan18_04_Compare_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string!");
        String user_Input1 = scanner.next();
        System.out.println("Enter the string!");
        String user_Input2 = scanner.next();

        if(user_Input1.equals(user_Input2)){
            System.out.println("Both the strings are equal");
        }else{
            System.out.println("Strings are different");
        }
    }

}
