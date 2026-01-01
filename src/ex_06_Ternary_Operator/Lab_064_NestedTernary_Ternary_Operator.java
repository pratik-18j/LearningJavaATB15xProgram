package ex_06_Ternary_Operator;

public class Lab_064_NestedTernary_Ternary_Operator {
    public static void main(String[] args) {
        int age = 17;

        String result = age >18 ? (age >25 ? "You can drink" : "Wait for some time!") : "No you are not allowed to go to the club";
        System.out.println(result);
    }
}
