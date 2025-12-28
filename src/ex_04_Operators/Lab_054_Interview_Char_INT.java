package ex_04_Operators;

public class Lab_054_Interview_Char_INT {
    public static void main(String[] args) {
        char a1 = 'A';  //ASCII 65
        char a2 = 'B';  //ASCI 66
        System.out.println(a1);
        System.out.println(a2);

        //char is basically integer behind the curtain when we try to use it with arithmetic operator
        System.out.println(a1 + a2);
        System.out.println(a1 - a2);

    }
}
