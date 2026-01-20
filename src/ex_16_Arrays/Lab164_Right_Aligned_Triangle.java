package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_Right_Aligned_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for n");
        int n = scanner.nextInt();
        for(int i = 1; i< n; i++){
            for (int j = 1; j <= n-i; j++ ){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
