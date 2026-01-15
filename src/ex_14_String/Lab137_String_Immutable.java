package ex_14_String;

public class Lab137_String_Immutable {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1);

        s1 = s1.concat(" world");
        System.out.println(s1);

        //In this case there will be 2 strings in String Constant Pool.
        //1. hello
        //2. hello world (which is latest value)
    }
}
