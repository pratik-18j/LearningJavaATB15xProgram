package ex_11_While;
import java.util.Scanner;
public class Lab_121_While_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int fact = 1;
            while(num>=1){
                fact = fact*num;
                num--;
            }
            System.out.println("Factorial :"+ fact);

        }else{
            System.out.println("Enter the valid integer");
        }

    }
}
