package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab_123_While_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 100");
        int guess = 0;
        int attempts = 0;

        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Invalid input");
                scanner.next();
            }
            guess = scanner.nextInt();
            attempts++;

            if(guess < numberToGuess){
                System.out.println("too low, try again");
            }else if(guess > numberToGuess){
                System.out.println("too high, try again");
            }else{
                System.out.println("Correct!, you have taken "+ attempts +" attempts");
                break;
            }
        }
    }
}
