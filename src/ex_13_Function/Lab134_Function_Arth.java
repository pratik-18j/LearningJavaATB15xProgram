package ex_13_Function;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = readInt(input, "Enter the 1st number: ");
        int b = readInt(input, "Enter the 2nd number: ");

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


        input.close();
    }

    static int readInt(Scanner input, String msg){
        System.out.println(msg);
        if (input.hasNextInt()){
            return input.nextInt();
        }else{
            System.out.println("Enter the Integer only!");
            System.exit(0);
            return 0;
        }
    }

    static int sum(int a,  int b){
        return a + b;
    }

    static int sub(int a,  int b){
        return a - b;
    }

    static int mul(int a, int b){
        return a * b;
    }

    static int div(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    static int mod(int a, int b){
        return a % b;
    }
}
