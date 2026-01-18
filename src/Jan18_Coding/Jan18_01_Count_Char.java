package Jan18_Coding;

import java.util.Scanner;

public class Jan18_01_Count_Char {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input_User = scanner.nextLine();
        int count = 0;

        for(int i = 0; i<input_User.length();i++){
            if(input_User.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("The length of the string is: "+ count);
    }
}
