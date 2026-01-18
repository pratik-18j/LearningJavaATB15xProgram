package Jan18_Coding;

//Write a Java program to check whether the length of a given string is greater
//        than 10 or not and print the result.


import java.util.Scanner;

public class Jan18_02_String_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string!");
        String user_Input = scanner.nextLine();

        if(user_Input.length()>10){
            System.out.println("Length of the string is greater than 10");
        }else {
            System.out.println("String is less than 10");
        }
    }
}
