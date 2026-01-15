package ex_14_String;

public class Lab141_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";//Will create the 2nd strinng SCP

        String s2 = new String("Hello"); //In case of new, it will create the new string irrespective of values
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == comparison operator  -> Checks the references

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // equals (content) -> checks for the value.

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //equalIgnoreCase => pratik, Pratik, PRATIK, PraTik, PratiK = pratik
        // == -> Check fo reference
        //equal => check the values









    }
}
