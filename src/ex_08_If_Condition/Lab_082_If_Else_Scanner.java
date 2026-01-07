package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_082_If_Else_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Your age is: "+ age);

        if (age>18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can not vote till you get 18");
        }

    }
}
