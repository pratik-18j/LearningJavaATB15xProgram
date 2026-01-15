package ex_14_String;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Pratik";

        boolean result = name.contains("t");
        System.out.println(result);

        name.toUpperCase();        //just creating the string but won't visible until and unless assigned to new var
        System.out.println(name);
    }
}
