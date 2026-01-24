package task;
import java.util.Scanner;
public class Jan19_Pyramid {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the rows number for the pyramid");
        int n = userInput.nextInt();

        for(int i = 1; i <=n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        userInput.close();
    }
}
