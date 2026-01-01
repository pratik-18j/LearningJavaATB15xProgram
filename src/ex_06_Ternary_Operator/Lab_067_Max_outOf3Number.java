package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab_067_Max_outOf3Number {
    public static void main(String[] args) {
        int n1 =Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        System.out.println(n1+" "+n2+" "+n3);

        int result =  n1 > n2 ?(n1 >n3? n1 : n3):(n2 > n3? n2 : n3);
        System.out.println("Max number out of three number is: " + result);
    }
}
