package ex_15_StringBuffer_StringBuilder_Functions;

import java.util.Scanner;

public class Lab149_String_Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String userInput = input.next();
        String rev = "";

        for(int i = (userInput.length()-1); i>=0; i--){
            rev = rev + userInput.charAt(i);
        }
        System.out.println(rev);

    }
}
