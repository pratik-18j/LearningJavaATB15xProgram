package ex_08_If_Condition;
import java.util.Scanner;

public class Task_27Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the three side lengths of triangle one by one");

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        if(s1 == s2 && s2 == s3){
            System.out.println("Its an Equilateral triangle");
        }
        else if(s1 == s2 || s2 == s3|| s3 == s1){
            System.out.println("Its an Isosceles triangle");
        }
        else{
            System.out.println("Its a scalene");
        }
        sc.close();
    }
}
