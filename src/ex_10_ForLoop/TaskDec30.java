package ex_10_ForLoop;

//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F)
//based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59


import java.util.Scanner;

public class TaskDec30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();

       if(marks < 0 || marks > 100){
           System.out.println("Please enter the valid marks");
       } else if (marks >=90){
            System.out.println("Grade A");
        } else if (marks >= 80){
           System.out.println("Grade B");
       } else if (marks >= 70){
           System.out.println("Grade C");
       } else if (marks >= 60){
           System.out.println("Grade D");
       } else {
           System.out.println("Grade F");
       }
       scanner.close();
    }
}