package ex_06_Ternary_Operator;

public class Lab_065_Interview_Question {
    public static void main(String[] args) {
        int x = 50;
        int y = 34;

        int max =  x > y? x: y;
        System.out.println(max);

        int min = x < y? x : y;
        System.out.println(min);
    }
}
