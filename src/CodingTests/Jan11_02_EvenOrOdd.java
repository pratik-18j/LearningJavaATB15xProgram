package CodingTests;

import java.util.Scanner;

public class Jan11_02_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println(number +" is an even number");
        }else{
            System.out.println(number +" is an odd number");
        }
        input.close();
    }
}
