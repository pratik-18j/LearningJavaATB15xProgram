package ex_15_StringBuffer_StringBuilder_Functions;

import java.util.Scanner;

public class Lab150_String_Pallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        String userInput = scanner.next();
        String revString = "";
        for(int i = userInput.length()-1; i >=0; i--){
            revString = revString + userInput.charAt(i);
        }
        if((userInput.toLowerCase()).equals(revString.toLowerCase())){
            System.out.println("Its a palindrome!!");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
