package ex_14_String;

public class LabStringExamples2 {
    public static void main(String[] args) {

        CharSequence s = "Pratik";
        //CharSequence is an Interface allows to create a sequence of char. It also provide the functions provided by stirng.

        System.out.println(s);
        System.out.println(s.subSequence(1,4)); //will print the char from 1 -3 and not the 4th one
    }
}
