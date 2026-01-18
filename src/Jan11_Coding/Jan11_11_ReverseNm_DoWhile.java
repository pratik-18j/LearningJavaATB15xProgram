package Jan11_Coding;

import java.util.Scanner;

public class Jan11_11_ReverseNm_DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_Input = scanner.nextInt();
        int rev_num  = 0;

        do {
         int digit = user_Input % 10;
         rev_num = (rev_num * 10) + digit;
         user_Input = user_Input/10;
        }
        while(user_Input>0);

        System.out.println("Reverse number is: "+ rev_num);
        scanner.close();
    }
}
