package ex_10_ForLoop;

import java.util.Scanner;

public class Lab_112_For_Loop_Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End of program");
    }
}
