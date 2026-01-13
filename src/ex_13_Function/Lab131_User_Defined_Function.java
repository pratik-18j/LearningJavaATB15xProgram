package ex_13_Function;

import java.util.Scanner;

public class Lab131_User_Defined_Function {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number a = ");
        int a = input.nextInt();
        System.out.println("Enter a number b = ");
        int b = input.nextInt();

        int sum = sum_of_two_numbers(a, b);
        System.out.println("Sum of two numbers is: "+sum);

    }
    static int sum_of_two_numbers(int x, int y){
        return x + y;
    }
}
