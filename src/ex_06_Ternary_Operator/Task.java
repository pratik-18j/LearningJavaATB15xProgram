package ex_06_Ternary_Operator;

public class Task {
    public static void main(String[] args) {
        int student_marks = 86;
        String result = student_marks>40?(student_marks>70? "Excellent": "Pass") : "Fail";
        System.out.println(result);
    }
}
