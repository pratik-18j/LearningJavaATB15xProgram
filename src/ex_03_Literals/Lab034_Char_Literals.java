package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A';  //A to Z, a to z, !@#$%^&*(

        char c2 = '3';
        char c3 = '#';
        char c4 = '(';
        char c5 = ' ';

        //Escape Sequece
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_space = '\r';

        System.out.println("Pratik Jagtap");
        System.out.println("Pratik"+new_line+"Jagtap");
        System.out.println("Pratik\nJagtap");
        System.out.println("Pratik"+tab_line+"Jagtap");
        System.out.println("Pratik"+back_space+"Jagtap");
        System.out.println("Pratik"+carriage_space+"Jagtap");


        System.out.println("============================");

        int binary = 0b1010;
        int hexa =  0xFF;
        long amount = 1_00;
        char a = 'A'; //65 which is ASCII value
        System.out.println(a);

    }
}
