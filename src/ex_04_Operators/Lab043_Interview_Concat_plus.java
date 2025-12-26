package ex_04_Operators;

public class Lab043_Interview_Concat_plus {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        String first_name = "Pratik";
        String last_name = "Jagtap";
        System.out.println(first_name +last_name);

        System.out.println(first_name + last_name + a + b);

        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));
    }
}
