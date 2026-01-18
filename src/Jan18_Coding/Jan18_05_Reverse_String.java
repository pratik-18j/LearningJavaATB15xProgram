package Jan18_Coding;

import java.util.Scanner;

public class Jan18_05_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string!");
        String user_Input = scanner.nextLine();
        String rev_String = "";

        for(int i = user_Input.length()-1; i>=0; i--){
            rev_String = rev_String + user_Input.charAt(i);
        }
        System.out.println("Reverse string is: "+ rev_String);
    }
}
